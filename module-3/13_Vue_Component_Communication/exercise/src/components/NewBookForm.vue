<template>
  <form class="new-book-form" v-on:submit.prevent="addNewBook">
      <input class="title-input" type="text" name="title" placeholder="Title" v-model="newBook.title"/>
      <input class="author-input" type="text" name="author" placeholder="Author" v-model="newBook.author"/>
      <input class="isbn-input" type="text" name="isbn" placeholder="ISBN" v-model="newBook.isbn"/>
      <button type="submit" class="btn">Save</button>
  </form>
</template>
<script>
export default {
    name:'new-book-form',
    data() {
        return {
            newBook: {
        title: '',
        author: '',
        read: false,
        isbn: ''
        }
      }
    },
    methods: {
        addNewBook() {
            this.$store.state.commit("ADD_NEW_BOOK", this.book);
            this.newBook = {
                title: '',
                author: '',
                read: false,
                isbn: ''
            };
        }
    }
}
</script>
<style>
</style>