const menu = {
    list() {
        return [{"backMenu":[{"child":[{"buttons":["新增","查看","修改","删除","收费"],"menu":"学生","menuJump":"列表","tableName":"xuesheng"}],"menu":"学生管理"},{"child":[{"buttons":["新增","查看","修改","删除","收费"],"menu":"教师","menuJump":"列表","tableName":"jiaoshi"}],"menu":"教师管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"宿舍信息","menuJump":"列表","tableName":"sushexinxi"}],"menu":"宿舍信息管理"},{"child":[{"buttons":["查看","修改","删除","支付","报表"],"menu":"学生缴费","menuJump":"列表","tableName":"xueshengjiaofei"}],"menu":"学生缴费管理"},{"child":[{"buttons":["查看","修改","删除","支付","报表"],"menu":"教师缴费","menuJump":"列表","tableName":"jiaoshijiaofei"}],"menu":"教师缴费管理"},{"child":[{"buttons":["新增","查看","修改","删除"],"menu":"轮播图管理","tableName":"config"},{"buttons":["新增","查看","修改","删除"],"menu":"校园公告","tableName":"news"}],"menu":"系统管理"}],"frontMenu":[],"hasBackLogin":"是","hasBackRegister":"否","hasFrontLogin":"否","hasFrontRegister":"否","roleName":"管理员","tableName":"users"},{"backMenu":[{"child":[{"buttons":["查看","支付"],"menu":"学生缴费","menuJump":"列表","tableName":"xueshengjiaofei"}],"menu":"学生缴费管理"}],"frontMenu":[],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"学生","tableName":"xuesheng"},{"backMenu":[{"child":[{"buttons":["查看","支付"],"menu":"教师缴费","menuJump":"列表","tableName":"jiaoshijiaofei"}],"menu":"教师缴费管理"}],"frontMenu":[],"hasBackLogin":"否","hasBackRegister":"否","hasFrontLogin":"是","hasFrontRegister":"是","roleName":"教师","tableName":"jiaoshi"}]
    }
}
export default menu;
