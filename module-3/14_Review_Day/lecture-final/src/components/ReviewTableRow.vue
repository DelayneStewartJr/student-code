<template>
  <tr>
    <td>{{ review.title }}</td>
    <td nowrap>{{ review.reviewer }}</td>
    <td>{{ review.review }}</td>
    <td class="stars">
      <img
        src="../assets/star.png"
        v-bind:title="review.rating + ' Star Review'"
        class="star"
        v-for="n in review.rating"
        v-bind:key="n"
        width="20px"
      />
    </td>
    <td>
      <input type="checkbox" v-bind:checked="review.favorited" v-on:change="onFavoritedChange(review)" />
    </td>

  </tr>
  
</template>

<script>
export default {
  name: "review-table-row",
  props: ["review"],
  methods: {
    onFavoritedChange(review) {
      this.$store.commit("FLIP_FAVORITED", review);
    }
  }
};
</script>

<style scoped>
.stars {
  display: flex;
}

tr:nth-child(even) {
  background-color: rgb(117, 148, 160);
}

td{
  padding: 10px; /*myron added*/
}
</style>
