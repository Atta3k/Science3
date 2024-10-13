import Vue from 'vue'
import Router from 'vue-router'
import Home from "../components/Home.vue";
import Add from "../components/Add.vue";
import Change from "../components/Change.vue";

Vue.use(Router)


export default new Router({
  routes:[
    {
      path:'/',name:'Home',component:Home,
    },
    {
      path:'/Add',name:'Add',component:Add,
    },
    {
      path:'/Change',name:'Change',component:Change,
    }
  ]
})
