<template>
    <v-container>
        Необходимо авторизоваться через
        <a href="/login">Google</a>
    </v-container>
</template>

<script>
    export default {
        name: "Auth",
        beforeMount() {
            if (this.profile) this.$router.replace('/')
        }
    }
</script>

<style scoped>

</style>