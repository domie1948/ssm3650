const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm64g10/",
            name: "ssm64g10",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssm64g10/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "数据结构课程网络学习平台"
        } 
    }
}
export default base
