const base = {
    get() {
        return {
            url : "http://localhost:8080/ssmb06jd/",
            name: "ssmb06jd",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmb06jd/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "应急互助信息管理系统"
        } 
    }
}
export default base
