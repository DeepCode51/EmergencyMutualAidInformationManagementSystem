import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'
    import gongzuotijiao from '@/views/modules/gongzuotijiao/list'
    import zhaomubaoming from '@/views/modules/zhaomubaoming/list'
    import gongzuofenpei from '@/views/modules/gongzuofenpei/list'
    import zhiyuanzheshenqing from '@/views/modules/zhiyuanzheshenqing/list'
    import qiuzhuxinxi from '@/views/modules/qiuzhuxinxi/list'
    import wuzizhonglei from '@/views/modules/wuzizhonglei/list'
    import wuzishenqing from '@/views/modules/wuzishenqing/list'
    import wuzixinxi from '@/views/modules/wuzixinxi/list'
    import wuzifenpei from '@/views/modules/wuzifenpei/list'
    import jinjitongzhi from '@/views/modules/jinjitongzhi/list'
    import xinlizhishi from '@/views/modules/xinlizhishi/list'
    import piyaozhuanqu from '@/views/modules/piyaozhuanqu/list'
    import zhaomuxinxi from '@/views/modules/zhaomuxinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import qiuzhuleixing from '@/views/modules/qiuzhuleixing/list'
    import yiliaojiuzhu from '@/views/modules/yiliaojiuzhu/list'
    import config from '@/views/modules/config/list'
    import zhiyuanzhe from '@/views/modules/zhiyuanzhe/list'


//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    }
      ,{
	path: '/gongzuotijiao',
        name: '工作提交',
        component: gongzuotijiao
      }
      ,{
	path: '/zhaomubaoming',
        name: '招募报名',
        component: zhaomubaoming
      }
      ,{
	path: '/gongzuofenpei',
        name: '工作分配',
        component: gongzuofenpei
      }
      ,{
	path: '/zhiyuanzheshenqing',
        name: '志愿者申请',
        component: zhiyuanzheshenqing
      }
      ,{
	path: '/qiuzhuxinxi',
        name: '求助信息',
        component: qiuzhuxinxi
      }
      ,{
	path: '/wuzizhonglei',
        name: '物资种类',
        component: wuzizhonglei
      }
      ,{
	path: '/wuzishenqing',
        name: '物资申请',
        component: wuzishenqing
      }
      ,{
	path: '/wuzixinxi',
        name: '物资信息',
        component: wuzixinxi
      }
      ,{
	path: '/wuzifenpei',
        name: '物资分配',
        component: wuzifenpei
      }
      ,{
	path: '/jinjitongzhi',
        name: '紧急通知',
        component: jinjitongzhi
      }
      ,{
	path: '/xinlizhishi',
        name: '心理知识',
        component: xinlizhishi
      }
      ,{
	path: '/piyaozhuanqu',
        name: '辟谣专区',
        component: piyaozhuanqu
      }
      ,{
	path: '/zhaomuxinxi',
        name: '招募信息',
        component: zhaomuxinxi
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/qiuzhuleixing',
        name: '求助类型',
        component: qiuzhuleixing
      }
      ,{
	path: '/yiliaojiuzhu',
        name: '医疗救助',
        component: yiliaojiuzhu
      }
      ,{
	path: '/config',
        name: '轮播图管理',
        component: config
      }
      ,{
	path: '/zhiyuanzhe',
        name: '志愿者',
        component: zhiyuanzhe
      }
    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;
