<template>
<view class="content">
	<view class="box" :style='{"minHeight":"100vh","width":"100%","padding":"120rpx 44rpx 244rpx 44rpx","background":"url(http://clfile.zggen.cn/20231204/89b286cdb44c4f3e9a91bc90ff72c4e2.jpg) no-repeat center top / 100% 100%,#ffffff","height":"100%"}'>
		<view :style='{"padding":"48rpx 48rpx 48rpx 48rpx","boxShadow":"0px 0px 0px #dddddd","margin":"0 0 244rpx 0","borderRadius":"4rpx","background":"none","display":"block","width":"100%","position":"relative","height":"auto"}'>
			<image :style='{"width":"160rpx","margin":"0 0 40rpx 0","borderRadius":"100%","objectFit":"cover","display":"none","height":"80rpx"}' src="http://clfile.zggen.cn/20231027/f76234bafa534579beeb9a486c2d2df2.jpg" mode="aspectFill"></image>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='lvke'" class="uni-form-item uni-column">
				<input :style='{"border":"0px solid #00000010","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#666","borderRadius":"60rpx","background":"#ffffff","width":"100%","fontSize":"28rpx","height":"80rpx"}'  v-model="ruleForm.lvkezhanghao" type="text" class="uni-input" name="" placeholder="旅客账号" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='lvke'" class="uni-form-item uni-column">
				<input :style='{"border":"0px solid #00000010","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#666","borderRadius":"60rpx","background":"#ffffff","width":"100%","fontSize":"28rpx","height":"80rpx"}' v-model="ruleForm.lvkemima" type="password" class="uni-input" name="" placeholder="旅客密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='lvke'" class="uni-form-item uni-column">
				<input :style='{"border":"0px solid #00000010","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#666","borderRadius":"60rpx","background":"#ffffff","width":"100%","fontSize":"28rpx","height":"80rpx"}' v-model="ruleForm.lvkemima2" type="password" class="uni-input" name="" placeholder="确认旅客密码" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='lvke'" class="uni-form-item uni-column">
				<input :style='{"border":"0px solid #00000010","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#666","borderRadius":"60rpx","background":"#ffffff","width":"100%","fontSize":"28rpx","height":"80rpx"}'  v-model="ruleForm.lvkexingming" type="text" class="uni-input" name="" placeholder="旅客姓名" />
			</view>
            <view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='lvke'" @tap="lvketouxiangTap" class="">
                <view>请上传头像</view>
                <image :style='{"width":"160rpx","borderRadius":"16rpx","objectFit":"contain","background":"#fff","display":"block","height":"120rpx"}' v-if="ruleForm.touxiang" class="avator" :src="baseUrl+ruleForm.touxiang" mode=""></image>
                <image :style='{"width":"160rpx","borderRadius":"16rpx","objectFit":"contain","background":"#fff","display":"block","height":"120rpx"}' v-else class="avator" src="../../static/gen/upload.png" mode=""></image>
            </view>
			<picker :style='{"border":"2rpx solid #00000010","padding":"0 20rpx","margin":"0 0 24rpx 0","borderRadius":"60rpx","background":"#ffffff","width":"100%","height":"auto"}' v-if="tableName=='lvke'"  @change="lvkexingbieChange" :value="lvkexingbieIndex" :range="lvkexingbieOptions">
				<view :style='{"width":"100%","lineHeight":"80rpx","fontSize":"28rpx","color":"#666"}' class="uni-input">{{ruleForm.xingbie?ruleForm.xingbie:"请选择性别"}}</view>
			</picker>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='lvke'" class="uni-form-item uni-column">
				<input :style='{"border":"0px solid #00000010","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#666","borderRadius":"60rpx","background":"#ffffff","width":"100%","fontSize":"28rpx","height":"80rpx"}'  v-model="ruleForm.shoujihao" type="text" class="uni-input" name="" placeholder="手机号" />
			</view>
			<view :style='{"width":"100%","margin":"0 0 24rpx 0","height":"auto"}' v-if="tableName=='lvke'" class="uni-form-item uni-column">
				<input :style='{"border":"0px solid #00000010","padding":"0px 24rpx 0 24rpx","margin":"0 0 0px 0","color":"#666","borderRadius":"60rpx","background":"#ffffff","width":"100%","fontSize":"28rpx","height":"80rpx"}'  v-model="ruleForm.shenfenzhenghao" type="text" class="uni-input" name="" placeholder="身份证号" />
			</view>
			<button :style='{"border":"0px solid #dddddd","padding":"0 0 0 0","margin":"0 0 24rpx 0","color":"#fff","borderRadius":"60rpx","background":"#d84fa9","width":"100%","lineHeight":"80rpx","fontSize":"32rpx","height":"80rpx"}' class="btn-submit" @tap="register" type="primary">注册</button>
		</view>
	</view>
</view>
</template>

<script>
    import multipleSelect from "@/components/momo-multipleSelect/momo-multipleSelect";
	export default {
		data() {
			return {
                lvkexingbieOptions: [],
                lvkexingbieIndex: 0,
				ruleForm: {
                lvkezhanghao: '',
                lvkemima: '',
                lvkexingming: '',
                touxiang: '',
                xingbie: '',
                shoujihao: '',
                shenfenzhenghao: '',
				},
				tableName:""
			}
		},
        components: {
            multipleSelect
        },
        computed: {
            baseUrl() {
                return this.$base.url;
            },
        },
		async onLoad() {
			let res = [];
			let table = uni.getStorageSync("loginTable");
            this.tableName = table;

			// 自定义下拉框值
			if(this.tableName=='lvke'){
                this.lvkexingbieOptions = "男,女".split(',');
				this.ruleForm.xingbie=this.lvkexingbieOptions[0]
			}
			
			this.styleChange()
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
					  const icon = {"color":"#666","display":"inline-block"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.radioTextActive').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#333","display":"inline-block"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.checkText').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#666"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.checkTextActive').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"color":"#666"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-radio-input').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #eeeeee","outlineColor":"#666666","background":"#ffffff","display":"inline-block"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-radio-input-checked').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #5fb959","color":"#fff","textAlign":"center","background":"#5fb959","display":"inline-block"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-checkbox-input').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"border":"2rpx solid #eeeeee","borderColor":"#666666","borderRadius":"40rpx","background":"#ffffff"}
					  Object.keys(icon).forEach((key) => {
						el.style[key] = icon[key]
					  })
					})
					document.querySelectorAll('.uni-checkbox-input-checked').forEach(el => {
					  el.removeAttribute('style')
					  const icon = {"borderColor":"#5fb959","color":"#fff","borderRadius":"0px","background":"#5fb959"}
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
			// 注册
			async register() {
				if((!this.ruleForm.lvkezhanghao) && `lvke` == this.tableName){
					this.$utils.msg(`旅客账号不能为空`);
					return
				}
				if((!this.ruleForm.lvkemima) && `lvke` == this.tableName){
					this.$utils.msg(`旅客密码不能为空`);
					return
				}
                if(`lvke` == this.tableName && (this.ruleForm.lvkemima!=this.ruleForm.lvkemima2)){
                    this.$utils.msg(`两次密码输入不一致`);
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
				await this.$api.register(`${this.tableName}`, this.ruleForm);
				this.$utils.msgBack('注册成功');;
			}
		}
	}
</script>

<style lang="scss" scoped>
	.content {
		min-height: calc(100vh - 44px);
		box-sizing: border-box;
	}
</style>
