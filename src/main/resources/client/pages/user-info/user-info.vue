<template>
<view class="content">
	<view class="box" :style='{"width":"100%","padding":"0 0 0 0","position":"relative","background":"#ffffff","height":"100%"}'>
		<view :style='{"width":"100%","padding":"24rpx 24rpx 24rpx 24rpx","background":"#ffffff","display":"block","height":"auto"}'>
			<view :style='{"padding":"0px 0 0px 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderRadius":"0px 0 0 0px","borderWidth":"0px 0px 2rpx 0px","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='lvke'" class="">
				<view class="title" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}'>旅客账号</view>
				<input :style='{"border":"0px solid #cccccc","padding":"0px 24rpx 0px 24rpx","margin":"0 0 0 0","color":"#666666","borderRadius":"0px","flex":"1","background":"none","fontSize":"28rpx","height":"64rpx"}' disabled="true"  v-model="ruleForm.lvkezhanghao" placeholder="旅客账号"></input>
			</view>
			<view :style='{"padding":"0px 0 0px 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderRadius":"0px 0 0 0px","borderWidth":"0px 0px 2rpx 0px","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='lvke'" class="">
				<view class="title" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}'>旅客姓名</view>
				<input :style='{"border":"0px solid #cccccc","padding":"0px 24rpx 0px 24rpx","margin":"0 0 0 0","color":"#666666","borderRadius":"0px","flex":"1","background":"none","fontSize":"28rpx","height":"64rpx"}'   v-model="ruleForm.lvkexingming" placeholder="旅客姓名"></input>
			</view>
			<view :style='{"padding":"0px 0 0px 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderRadius":"0px 0 0 0px","borderWidth":"0px 0px 2rpx 0px","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='lvke'" @tap="lvketouxiangTap" class="">
				<view class="title" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}'>头像</view>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' v-if="ruleForm.touxiang" style="margin: 0;" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
				<image :style='{"width":"80rpx","borderRadius":"100%","objectFit":"cover","display":"block","height":"80rpx"}' v-else class="avator" style="margin: 0;" src="../../static/gen/upload.png" mode=""></image>
			</view>
			<view v-if="tableName=='lvke'" :style='{"padding":"0px 0 0px 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderRadius":"0px 0 0 0px","borderWidth":"0px 0px 2rpx 0px","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' class=" select">
				<view :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}' class="title">性别</view>
				<picker :style='{"width":"100%","flex":"1","height":"auto"}'  @change="lvkexingbieChange" :value="lvkexingbieIndex" :range="lvkexingbieOptions">
					<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666666"}' class="uni-input picker-select-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
				</picker>
			</view>
			<view :style='{"padding":"0px 0 0px 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderRadius":"0px 0 0 0px","borderWidth":"0px 0px 2rpx 0px","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='lvke'" class="">
				<view class="title" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}'>手机号</view>
				<input :style='{"border":"0px solid #cccccc","padding":"0px 24rpx 0px 24rpx","margin":"0 0 0 0","color":"#666666","borderRadius":"0px","flex":"1","background":"none","fontSize":"28rpx","height":"64rpx"}'   v-model="ruleForm.shoujihao" placeholder="手机号"></input>
			</view>
			<view :style='{"padding":"0px 0 0px 0","margin":"0 0 24rpx 0","borderColor":"#eeeeee","alignItems":"center","borderRadius":"0px 0 0 0px","borderWidth":"0px 0px 2rpx 0px","background":"#fff","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}' v-if="tableName=='lvke'" class="">
				<view class="title" :style='{"width":"160rpx","padding":"0 20rpx 0 0","lineHeight":"80rpx","fontSize":"28rpx","color":"#333333","textAlign":"right"}'>身份证号</view>
				<input :style='{"border":"0px solid #cccccc","padding":"0px 24rpx 0px 24rpx","margin":"0 0 0 0","color":"#666666","borderRadius":"0px","flex":"1","background":"none","fontSize":"28rpx","height":"64rpx"}'   v-model="ruleForm.shenfenzhenghao" placeholder="身份证号"></input>
			</view>
			<view :style='{"width":"100%","margin":"40rpx 0 0 0","justifyContent":"center","display":"flex","height":"auto"}' class="btn">
				<button @tap="update()" class="cu-btn lg" :style='{"border":"0","padding":"0 0 0 0","margin":"0 20rpx 0 20rpx","color":"#fff","borderRadius":"60rpx","background":"#d84fa9","width":"240rpx","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}'>保存</button>
				<button @tap="logout()" class="cu-btn lg" :style='{"border":"0","padding":"0 0 0 0","margin":"0 20rpx 0 20rpx","color":"#fff","borderRadius":"60rpx","background":"#5fb959","width":"240rpx","lineHeight":"80rpx","fontSize":"28rpx","height":"80rpx"}'>退出登录</button>
			</view>
		</view>
	</view>
</view>
</template>

<script>
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
				ruleForm: {
				},
				tableName:"",
				lvkexingbieOptions: [],
				lvkexingbieIndex: 0,
			}
		},
        components: {
            multipleSelect
        },
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
		async onLoad() {
			let table = uni.getStorageSync("nowTable");
			let res = await this.$api.session(table);
			this.ruleForm = res.data;
			this.tableName = table;
			// 自定义下拉框值
			if(this.tableName=='lvke'){
				this.lvkexingbieOptions = "男,女".split(',');
				this.lvkexingbieOptions.forEach((item, index) => {
					if(item==this.ruleForm.xingbie) {
						this.lvkexingbieIndex = index;
					}
				});
			}
			this.styleChange()
            this.$forceUpdate()
		},
		methods: {
			lvketouxiangTap() {
				let _this = this;
				this.$api.upload(function(res) {
					_this.ruleForm.touxiang = 'file/' + res.file;
					_this.$forceUpdate();
				});
			},
            // 下拉变化
            lvkexingbieChange(e) {
                    this.lvkexingbieIndex = e.target.value
                    this.ruleForm.xingbie = this.lvkexingbieOptions[this.lvkexingbieIndex]
            },

            toggleTab(str) {
                this.$refs[str].show();
            },

			styleChange() {
				this.$nextTick(()=>{
					document.querySelectorAll('.radioText').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#666666"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.radioTextActive').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#333"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.checkText').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#666666"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.checkTextActive').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#333"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-radio-input').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #999999","borderRadius":"0","background":"#ffffff"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-radio-input-checked').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #5fb959","borderRadius":"0","color":"#fff","background":"#5fb959"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-checkbox-input').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #999999","borderRadius":"0","background":"#ffffff"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-checkbox-input-checked').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #5fb959","color":"#fff","borderRadius":"0","background":"#5fb959"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
				})
			},
			// 获取uuid
			getUUID () {
				return new Date().getTime();
			},
			logout() {
				uni.clearStorageSync()
				uni.reLaunch({
					url:'/pages/index/index'
				})
			},
			
			// 注册
			async update() {
				if((!this.ruleForm.lvkezhanghao) && `lvke` == this.tableName){
					this.$utils.msg(`旅客账号不能为空`);
					return
				}
				if((!this.ruleForm.lvkemima) && `lvke` == this.tableName){
					this.$utils.msg(`旅客密码不能为空`);
					return
				}
				if((!this.ruleForm.lvkexingming) && `lvke` == this.tableName){
					this.$utils.msg(`旅客姓名不能为空`);
					return
				}
				if(`lvke` == this.tableName && this.ruleForm.shoujihao&&(!this.$validate.isMobile(this.ruleForm.shoujihao))){
					this.$utils.msg(`手机号应输入手机格式`);
					return
				}
				if(`lvke` == this.tableName && this.ruleForm.shenfenzhenghao&&(!this.$validate.checkIdCard(this.ruleForm.shenfenzhenghao))){
					this.$utils.msg(`身份证号应输入身份证格式`);
					return
				}
				let table = uni.getStorageSync("nowTable");
				await this.$api.update(table, this.ruleForm);
				this.$utils.msgBack('修改成功');;
			},

		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
