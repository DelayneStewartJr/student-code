<template>
<div class= "student- display">
    <h2>John Mueller<h2>
<div>    
</template>

<script>
export default {
    name: "student-info"
}
</script>


<style scoped>
.student-display {
    display: flex;
    flex-direction: row;
    justify-content: space-between;
    padding: 10px 30px;
    background-color: #220e9;
    width: 40%;
    border: 4px gold solid;
    margin-bottom: 5px;
}

h2 {
    color: gold;
    font-size; 2em;
}
</style>