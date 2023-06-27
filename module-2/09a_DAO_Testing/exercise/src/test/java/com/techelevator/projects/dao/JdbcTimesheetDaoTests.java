package com.techelevator.projects.dao;

import com.techelevator.projects.model.Timesheet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.sql.Time;
import java.time.LocalDate;
import java.util.List;

public class JdbcTimesheetDaoTests extends BaseDaoTests {

    private static final Timesheet TIMESHEET_1 = new Timesheet(1, 1, 1,
            LocalDate.parse("2021-01-01"), 1.0, true, "Timesheet 1");
    private static final Timesheet TIMESHEET_2 = new Timesheet(2, 1, 1,
            LocalDate.parse("2021-01-02"), 1.5, true, "Timesheet 2");
    private static final Timesheet TIMESHEET_3 = new Timesheet(3, 2, 1,
            LocalDate.parse("2021-01-01"), 0.25, true, "Timesheet 3");
    private static final Timesheet TIMESHEET_4 = new Timesheet(4, 2, 2,
            LocalDate.parse("2021-02-01"), 2.0, false, "Timesheet 4");
    
    private JdbcTimesheetDao dao;

    private Timesheet testTimesheet;
    @Before
    public void setup() {
        dao = new JdbcTimesheetDao(dataSource);
        testTimesheet = new Timesheet(1, 2, 3, LocalDate.now(), 1, true, "Timesheet Test");

    }

    @Test
    public void getTimesheetById_returns_correct_timesheet_for_id() {
        Timesheet timesheet = dao.getTimesheetById(1);
        assertTimesheetsMatch(TIMESHEET_1, timesheet);

        timesheet = dao.getTimesheetById(2);
        assertTimesheetsMatch(TIMESHEET_2, timesheet);
    }

    @Test
    public void getTimesheetById_returns_null_when_id_not_found() {
        Timesheet timesheet = dao.getTimesheetById(10);
        Assert.assertNull(timesheet);
    }

    @Test
    public void getTimesheetsByEmployeeId_returns_list_of_all_timesheets_for_employee() {
        List<Timesheet> timesheets = dao.getTimesheetsByEmployeeId(2);
        Assert.assertEquals(2, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_4, timesheets.get(3));
        assertTimesheetsMatch(TIMESHEET_3, timesheets.get(2));

        timesheets = dao.getTimesheetsByEmployeeId(1);
        Assert.assertEquals(2, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_1, timesheets.get(0));
        assertTimesheetsMatch(TIMESHEET_2, timesheets.get(1) );
    }

    @Test
    public void getTimesheetsByProjectId_returns_list_of_all_timesheets_for_project() {
        List<Timesheet> timesheets = dao.getTimesheetsByProjectId(1);
        Assert.assertEquals(3, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_1, timesheets.get(0));
        assertTimesheetsMatch(TIMESHEET_2, timesheets.get(1));
        assertTimesheetsMatch(TIMESHEET_3, timesheets.get(2));

        timesheets = dao.getTimesheetsByProjectId(2);
        Assert.assertEquals(1, timesheets.size());
        assertTimesheetsMatch(TIMESHEET_4, timesheets.get(0));
    }

    @Test
    public void created_timesheet_has_expected_values_when_retrieved() {
        Timesheet createdTimesheet = dao.createTimesheet(testTimesheet);

        int newId = createdTimesheet.getTimesheetId();
        Assert.assertTrue(newId > 0 );

        Timesheet oldTimesheet = dao.getTimesheetById(newId);
        assertTimesheetsMatch(createdTimesheet, oldTimesheet);
    }

    @Test
    public void updated_timesheet_has_expected_values_when_retrieved() {
        Timesheet updTimesheet = dao.getTimesheetById(1);
        updTimesheet.setProjectId(1);
        updTimesheet.setEmployeeId(1);
        updTimesheet.setDateWorked(LocalDate.parse("2021-01-01"));
        updTimesheet.setHoursWorked(1);
        updTimesheet.setBillable(true);
        updTimesheet.setDescription("Updated Timesheet 1" );

        Timesheet timesheet = dao.updateTimesheet(updTimesheet);
        Assert.assertEquals(updTimesheet.getTimesheetId(), timesheet.getTimesheetId());

        assertTimesheetsMatch(updTimesheet, timesheet);

    }

    @Test
    public void deleted_timesheet_can_no_longer_be_retrieved() {
        Timesheet delTimesheet = dao.getTimesheetById(1);
        Assert.assertNull(delTimesheet);
    }

    @Test
    public void getBillableHours_returns_correct_total() {
     double billableHours = dao.getBillableHours(1, 1);
     Assert.assertEquals(1.5 + 1.0, billableHours, .1);

     billableHours = dao.getBillableHours(2, 2);
     Assert.assertEquals(0, billableHours, .1);
    }

    private void assertTimesheetsMatch(Timesheet expected, Timesheet actual) {
        Assert.assertEquals(expected.getTimesheetId(), actual.getTimesheetId());
        Assert.assertEquals(expected.getEmployeeId(), actual.getEmployeeId());
        Assert.assertEquals(expected.getProjectId(), actual.getProjectId());
        Assert.assertEquals(expected.getDateWorked(), actual.getDateWorked());
        Assert.assertEquals(expected.getHoursWorked(), actual.getHoursWorked(), 0.001);
        Assert.assertEquals(expected.isBillable(), actual.isBillable());
        Assert.assertEquals(expected.getDescription(), actual.getDescription());
    }

}
