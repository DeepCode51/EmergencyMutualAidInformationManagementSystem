
var projectName = '应急互助信息管理系统';
/**
 * 轮播图配置
 */
var swiper = {
	// 设定轮播容器宽度，支持像素和百分比
	width: '100%',
	height: '400px',
	// hover（悬停显示）
	// always（始终显示）
	// none（始终不显示）
	arrow: 'none',
	// default（左右切换）
	// updown（上下切换）
	// fade（渐隐渐显切换）
	anim: 'default',
	// 自动切换的时间间隔
	// 默认3000
	interval: 2000,
	// 指示器位置
	// inside（容器内部）
	// outside（容器外部）
	// none（不显示）
	indicator: 'outside'
}

/**
 * 个人中心菜单
 */
var centerMenu = [{
	name: '个人中心',
	url: '../' + localStorage.getItem('userTable') + '/center.html'
}, 
{
        name: '我的收藏',
        url: '../storeup/list.html'
}
]


var indexNav = [

{
	name: '紧急通知',
	url: './pages/jinjitongzhi/list.html'
}, 
{
	name: '物资信息',
	url: './pages/wuzixinxi/list.html'
}, 
{
	name: '心理知识',
	url: './pages/xinlizhishi/list.html'
}, 
{
	name: '辟谣专区',
	url: './pages/piyaozhuanqu/list.html'
}, 
{
	name: '招募信息',
	url: './pages/zhaomuxinxi/list.html'
}, 

]

var adminurl =  "http://localhost:8080/ssmb06jd/admin/dist/index.html";

var cartFlag = false

var chatFlag = false




var menu = [{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["新增","查看","修改","删除"],"menu":"紧急通知","menuJump":"列表","tableName":"jinjitongzhi"}],"menu":"紧急通知管理"},{"child":[{"appFrontIcon":"cuIcon-list","buttons":["新增","查看","修改","删除"],"menu":"用户","menuJump":"列表","tableName":"yonghu"}],"menu":"用户管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["新增","查看","修改","删除"],"menu":"志愿者","menuJump":"列表","tableName":"zhiyuanzhe"}],"menu":"志愿者管理"},{"child":[{"appFrontIcon":"cuIcon-news","buttons":["查看","删除","审核","报表"],"menu":"求助信息","menuJump":"列表","tableName":"qiuzhuxinxi"}],"menu":"求助信息管理"},{"child":[{"appFrontIcon":"cuIcon-explore","buttons":["新增","查看","修改","删除"],"menu":"求助类型","menuJump":"列表","tableName":"qiuzhuleixing"}],"menu":"求助类型管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["查看","删除","审核"],"menu":"志愿者申请","menuJump":"列表","tableName":"zhiyuanzheshenqing"}],"menu":"志愿者申请管理"},{"child":[{"appFrontIcon":"cuIcon-wenzi","buttons":["新增","查看","修改","删除"],"menu":"物资种类","menuJump":"列表","tableName":"wuzizhonglei"}],"menu":"物资种类管理"},{"child":[{"appFrontIcon":"cuIcon-album","buttons":["新增","查看","修改","删除","物资分配"],"menu":"物资信息","menuJump":"列表","tableName":"wuzixinxi"}],"menu":"物资信息管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看","删除"],"menu":"物资分配","menuJump":"列表","tableName":"wuzifenpei"}],"menu":"物资分配管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看","删除","审核"],"menu":"物资申请","menuJump":"列表","tableName":"wuzishenqing"}],"menu":"物资申请管理"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["新增","查看","修改","删除"],"menu":"心理知识","menuJump":"列表","tableName":"xinlizhishi"}],"menu":"心理知识管理"},{"child":[{"appFrontIcon":"cuIcon-paint","buttons":["新增","查看","修改","删除"],"menu":"辟谣专区","menuJump":"列表","tableName":"piyaozhuanqu"}],"menu":"辟谣专区管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["查看","删除","审核"],"menu":"医疗救助","menuJump":"列表","tableName":"yiliaojiuzhu"}],"menu":"医疗救助管理"},{"child":[{"appFrontIcon":"cuIcon-time","buttons":["新增","查看","修改","删除"],"menu":"招募信息","menuJump":"列表","tableName":"zhaomuxinxi"}],"menu":"招募信息管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","删除","审核"],"menu":"招募报名","menuJump":"列表","tableName":"zhaomubaoming"}],"menu":"招募报名管理"},{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["新增","查看","修改","删除"],"menu":"工作分配","menuJump":"列表","tableName":"gongzuofenpei"}],"menu":"工作分配管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","删除","审核"],"menu":"工作提交","menuJump":"列表","tableName":"gongzuotijiao"}],"menu":"工作提交管理"},{"child":[{"appFrontIcon":"cuIcon-flashlightopen","buttons":["查看","修改","删除"],"menu":"轮播图管理","tableName":"config"}],"menu":"系统管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看"],"menu":"紧急通知列表","menuJump":"列表","tableName":"jinjitongzhi"}],"menu":"紧急通知模块"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看","物资申请"],"menu":"物资信息列表","menuJump":"列表","tableName":"wuzixinxi"}],"menu":"物资信息模块"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看"],"menu":"心理知识列表","menuJump":"列表","tableName":"xinlizhishi"}],"menu":"心理知识模块"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看"],"menu":"辟谣专区列表","menuJump":"列表","tableName":"piyaozhuanqu"}],"menu":"辟谣专区模块"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","招募报名"],"menu":"招募信息列表","menuJump":"列表","tableName":"zhaomuxinxi"}],"menu":"招募信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-news","buttons":["新增","查看","修改","删除"],"menu":"求助信息","menuJump":"列表","tableName":"qiuzhuxinxi"}],"menu":"求助信息管理"},{"child":[{"appFrontIcon":"cuIcon-pay","buttons":["新增","查看","修改","删除"],"menu":"志愿者申请","menuJump":"列表","tableName":"zhiyuanzheshenqing"}],"menu":"志愿者申请管理"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看"],"menu":"物资分配","menuJump":"列表","tableName":"wuzifenpei"}],"menu":"物资分配管理"},{"child":[{"appFrontIcon":"cuIcon-newshot","buttons":["查看"],"menu":"物资申请","menuJump":"列表","tableName":"wuzishenqing"}],"menu":"物资申请管理"},{"child":[{"appFrontIcon":"cuIcon-full","buttons":["新增","查看","修改","删除"],"menu":"医疗救助","menuJump":"列表","tableName":"yiliaojiuzhu"}],"menu":"医疗救助管理"},{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看","删除"],"menu":"招募报名","menuJump":"列表","tableName":"zhaomubaoming"}],"menu":"招募报名管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看"],"menu":"紧急通知列表","menuJump":"列表","tableName":"jinjitongzhi"}],"menu":"紧急通知模块"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看","物资申请"],"menu":"物资信息列表","menuJump":"列表","tableName":"wuzixinxi"}],"menu":"物资信息模块"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看"],"menu":"心理知识列表","menuJump":"列表","tableName":"xinlizhishi"}],"menu":"心理知识模块"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看"],"menu":"辟谣专区列表","menuJump":"列表","tableName":"piyaozhuanqu"}],"menu":"辟谣专区模块"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","招募报名"],"menu":"招募信息列表","menuJump":"列表","tableName":"zhaomuxinxi"}],"menu":"招募信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"用户","tableName":"yonghu"},{"backMenu":[{"child":[{"appFrontIcon":"cuIcon-rank","buttons":["查看","工作提交"],"menu":"工作分配","menuJump":"列表","tableName":"gongzuofenpei"}],"menu":"工作分配管理"},{"child":[{"appFrontIcon":"cuIcon-pic","buttons":["查看","删除"],"menu":"工作提交","menuJump":"列表","tableName":"gongzuotijiao"}],"menu":"工作提交管理"}],"frontMenu":[{"child":[{"appFrontIcon":"cuIcon-phone","buttons":["查看"],"menu":"紧急通知列表","menuJump":"列表","tableName":"jinjitongzhi"}],"menu":"紧急通知模块"},{"child":[{"appFrontIcon":"cuIcon-cardboard","buttons":["查看","物资申请"],"menu":"物资信息列表","menuJump":"列表","tableName":"wuzixinxi"}],"menu":"物资信息模块"},{"child":[{"appFrontIcon":"cuIcon-addressbook","buttons":["查看"],"menu":"心理知识列表","menuJump":"列表","tableName":"xinlizhishi"}],"menu":"心理知识模块"},{"child":[{"appFrontIcon":"cuIcon-clothes","buttons":["查看"],"menu":"辟谣专区列表","menuJump":"列表","tableName":"piyaozhuanqu"}],"menu":"辟谣专区模块"},{"child":[{"appFrontIcon":"cuIcon-shop","buttons":["查看","招募报名"],"menu":"招募信息列表","menuJump":"列表","tableName":"zhaomuxinxi"}],"menu":"招募信息模块"}],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"志愿者","tableName":"zhiyuanzhe"}]


var isAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].backMenu.length;j++){
                for(let k=0;k<menus[i].backMenu[j].child.length;k++){
                    if(tableName==menus[i].backMenu[j].child[k].tableName){
                        let buttons = menus[i].backMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}

var isFrontAuth = function (tableName,key) {
    let role = localStorage.getItem("userTable");
    let menus = menu;
    for(let i=0;i<menus.length;i++){
        if(menus[i].tableName==role){
            for(let j=0;j<menus[i].frontMenu.length;j++){
                for(let k=0;k<menus[i].frontMenu[j].child.length;k++){
                    if(tableName==menus[i].frontMenu[j].child[k].tableName){
                        let buttons = menus[i].frontMenu[j].child[k].buttons.join(',');
                        return buttons.indexOf(key) !== -1 || false
                    }
                }
            }
        }
    }
    return false;
}
