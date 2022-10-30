import Vue from 'vue'
import App from './app.vue'
import router from './router'

// createApp(App).mount('#app')
Vue.config.productionTip = false;
new Vue({
    router,
    render:h => h(App),
}).$mount('#app')
