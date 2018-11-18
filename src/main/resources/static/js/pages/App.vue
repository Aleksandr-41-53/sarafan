<template>
    <div>
    <div v-if="!profile">Необходимо авторизоваться через <a href="/login">Google</a></div>
    <div v-else>
        <div>{{profile.name}}&nbsp;<a href="/logout">Выйти</a></div>
            <messages-list :messages="messages" />
        </div>
    </div>
</template>

<script>
    import MessagesList from 'components/messages/MessageList.vue'
    import { addHandler } from 'util/ws'
    import { getIndex } from 'util/collections'

    export default {
        comments: {
            MessagesList
        },
        data() {
            return {
                messages: frontendData.messages,
                profile: frontendData.profile
            }
        },
        created() {
            addHandler(data => {
                let index = getIndex(this.message, data.id)
                if (index > -1) {
                    this.message.splice(index, 1, data)
                } else {
                    this.message.push(data)
                }
            })
        }
    }
</script>

<style>

</style>
