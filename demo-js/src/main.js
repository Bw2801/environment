import Vue from 'vue'

import App from './App.vue'
import Client from './components/Client.vue'
import Actor from './components/Actor.vue'

import Buefy from 'buefy'
import 'buefy/lib/buefy.css'
import 'bulma/css/bulma.min.css'

import VueResource from 'vue-resource'
import VueRouter from 'vue-router'

Vue.config.productionTip = false

Vue.use(Buefy)
Vue.use(VueResource)
Vue.use(VueRouter)

const router = new VueRouter({
  mode: 'history',
  routes: [
    {
      path: '/client',
      component: Client
    },
    {
      path: '/client/:user',
      component: Client
    },
    {
      path: '/client/:user/:key',
      component: Client
    },
    {
      path: '/actor',
      component: Actor
    }
  ]
})

new Vue({
  render: h => h(App),
  router
}).$mount('#app')
