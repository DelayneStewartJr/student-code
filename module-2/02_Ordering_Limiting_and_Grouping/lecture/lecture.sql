-- ORDERING RESULTS
SELECT * FROM state;
SELECT DISTINCT * FROM state;

-- Populations of all states from largest to smallest.


-- States sorted alphabetically (A-Z) within their census region. The census regions are sorted in reverse alphabetical (Z-A) order.
SELECT state_name, census_region
FROM state
ORDER BY census_region DESC, state_name ASC; 

-- The biggest park by area
SELECT  park_name, area
From park
ORDER BY area DESC;



-- LIMITING RESULTS

-- The 10 largest cities by populations
SELECT city_name, population
FROM city 
ORDER BY population DESC
LIMIT 10;


-- The 20 oldest parks from oldest to youngest in years, sorted alphabetically by name.
SELECT (CURRENT_DATE - date_established)/365 AS age, park_name
FROM park
ORDER BY age DESC, park_name ASC
LIMIT 20;



-- CONCATENATING OUTPUTS

-- All city names and their state abbreviation.
SELECT (city_name || ' (' || state_abbreviation || ')')
FROM city
ORDER BY city_name;



-- The all parks by name and date established.
SELECT park_name ||'(' || date_established || ')' AS all_park_dates
FROM park;



-- The census region and state name of all states in the West & Midwest sorted in ascending order.
SELECT census_region || ':' || state_name || ':' AS region_and_state
FROM state
WHERE census_region ILIKE 


-- AGGREGATE FUNCTIONS

-- Average population across all the states. Note the use of alias, common with aggregated values.
SELECT avg(population) AS state_population
FROM state;



-- Total population in the West and South census regions
SELECT SUM(population) AS west_and_south_region_total
FROM state
WHERE census_region IN ('West', 'South');


-- The number of cities with populations greater than 1 million
SELECT COUNT(population) AS big_cities
FROM city 
WHERE population > 1000000;


-- The number of state nicknames.
SELECT COUNT (state_nickname) AS nickname_count, COUNT (*) AS row_count
FROM state;


-- The area of the smallest and largest parks.
SELECT MIN(area) AS smallest, MAX(area) AS largest
FROM park;



-- GROUP BY

-- Count the number of cities in each state, ordered from most cities to least.
SELECT state_abbreviation, COUNT(city_name) AS cities
FROM city
GROUP BY state_abbreviation
ORDER BY cities DESC;
 
-- Determine the average park area depending upon whether parks allow camping or not.
SELECT has_camping, AVG(area) AS avg_park_area
FROM park
GROUP BY has_camping;

-- Sum of the population of cities in each state ordered by state abbreviation.
SELECT state_abbreviation, SUM(population) AS all_population
FROM city
GROUP BY state_abbreviation
ORDER BY state_abbreviation;


-- The smallest city population in each state ordered by city population.
SELECT state_abbreviation, MIN(population) AS smallest_city
FROM city 
GROUP BY state_abbreviation 
ORDER BY smallest_city ;



-- Miscelleneous 

-- While you can use LIMIT to limit the number of results returned by a query,
-- it's recommended to use OFFSET and FETCH if you want to get
-- "pages" of results.
-- For instance, to get the first 10 rows in the city table
-- ordered by the name, you could use the following query.
-- (Skip 0 rows, and return only the first 10 rows from the sorted result set.)
SELECT city_name, population 
FROM city 
ORDER BY city_name
OFFSET 0 ROWS FETCH NEXT 10 ROWS ONLY;



-- SUBQUERIES (optional)
-- The names of cities that are in states with a state population greater than 2 million -- IL, TX, CA, NY
SELECT city_name, area, population
FROM city 
WHERE state_abbreviation IN (SELECT state_abbreviation FROM city WHERE population > 2000000);




