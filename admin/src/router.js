import Vue from 'vue'

import Router from 'vue-router'
import Login from './views/login'
import Admin from './views/admin'
import Welcome from './views/admin/welcome'
import Chapter from './views/admin/chapter'
Vue.use(Router);
export default new Router({
    model : "history",
    base:process.env.BASE_URL,
    routes : [{
        path: '*',
        redirect: "/login",
    },{
        path: '/login',
        component:Login
    },{
        path: '/',
        name:"admin",
        component: Admin,
        children : [{
            path: 'welcome',
            name:"welcome",
            component: Welcome,
        },{
            path: 'business/chapter',
            name:"business/chapter",
            component: Chapter,
        }
        
        
        ]
    }
    ]
})