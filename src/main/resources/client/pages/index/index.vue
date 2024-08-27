<template>
<view class="content">
	<view :style='{"width":"100%","flexWrap":"wrap","background":"#ffffff","display":"flex","height":"100%"}'>
        <z-swiper v-model="swiperList" :options="options2" :style='{"width":"100%","margin":"0 0 20rpx 0","background":"#ffffff","height":"360rpx"}' style="touch-action: none;">
            <z-swiper-item style="touch-action: none;" :style='{"width":"100%","background":"#ffffff","height":"100%"}' v-for="(swiper,index) in swiperList" :key="index" @tap="onSwiperTap(swiper)">
            	<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"100%"}' mode="aspectFill" :src="baseUrl+swiper.img"></image>
            	<view v-if="false" :style='{"width":"100%","padding":"0 8rpx 0 8rpx","lineHeight":"60rpx","fontSize":"28rpx","color":"#333333","background":"#ffffff"}'>{{ swiper.title }}</view>
            </z-swiper-item>
        </z-swiper>


		<!-- menu -->
		<view v-if="true" class="menu" :style='{"padding":"0px 0px 0px 40rpx","margin":"40rpx 0px 20rpx 0px","borderColor":"#eee","borderRadius":"8rpx","flexWrap":"wrap","background":"#ffffff","borderWidth":"0px","display":"flex","width":"100%","borderStyle":"solid","height":"auto"}'>
            <block v-for="item in menuList" v-bind:key="item.roleName">
                <block v-if="role==item.roleName" v-bind:key="index" v-for=" (menu,index) in item.frontMenu">
					<view v-if="menu.childs.length" :style='{"width":"calc(25% - 40rpx)","padding":"12rpx 0 12rpx 0","margin":"0px 40rpx 20rpx 0","borderRadius":"16rpx","height":"auto"}' class="menu-list" @tap="menuClick(menu,index)">
						<view class="iconarr" :class="menu.fontClass" :style='{"border":"4rpx solid #d84fa930","padding":"0 0 0 0","margin":"0 auto 12rpx auto","color":"#d84fa9","borderRadius":"400rpx","textAlign":"center","background":"#fff6fb","display":"block","width":"96rpx","lineHeight":"96rpx","fontSize":"60rpx","height":"96rpx"}'></view>
						<view :style='{"padding":"0 0 0 0","margin":"0px auto 0 auto","color":"#333333","textAlign":"center","width":"100%","lineHeight":"1.5","fontSize":"26rpx"}'>{{menu.menu}}</view>
					</view>
                </block>
            </block>
		</view>
		<!-- menu -->
		
		

		<!-- 商品推荐 -->
		<view class="listBox recommend" :style='{"width":"100%","margin":"40rpx 0 40rpx 0","background":"#ffffff","order":"2"}'>
			<view v-if="false && 3 == 1" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","width":"100%","justifyContent":"space-between","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">学会选择，学会放弃；</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box2">耐得住寂寞，经得起诱惑。</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
			<view class="title" :style='{"width":"calc(100% - 48rpx)","padding":"20rpx 80rpx 20rpx 80rpx","margin":"0 24rpx 24rpx 24rpx","textAlign":"center","background":"url(http://clfile.zggen.cn/20231201/929f7c0aed824bb3959e8ba0641392c8.gif) no-repeat center center / 100%","height":"auto"}'>
				<view :style='{"padding":"0","color":"#d84fa9","borderRadius":"0px","textAlign":"center","background":"none","display":"inline-block","width":"auto","fontSize":"36rpx","lineHeight":"40rpx","minWidth":"300rpx","fontWeight":"500"}'>景点信息推荐</view>
			</view>
			
			<view v-if="false && 3 == 2" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","width":"100%","justifyContent":"space-between","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">学会选择，学会放弃；</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box2">耐得住寂寞，经得起诱惑。</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
			
			
			
			  
			
			<!-- 样式6 -->
			<view class="list-box style6" :style='{"width":"100%","padding":"24rpx 24rpx 24rpx 24rpx","margin":"0 0 0 0","height":"auto"}'>
				<view v-if="jingdianxinxilist.length > 0" @tap="onDetailTap('jingdianxinxi',jingdianxinxilist[0].id)" class="box box1" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
					<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">{{jingdianxinxilist[0].jingdianmingcheng}}</view>
					<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="jingdianxinxilist[0].jingdiantupian.substring(0,4)=='http'" :src="jingdianxinxilist[0].jingdiantupian"></image>
					<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="jingdianxinxilist[0].jingdiantupian?baseUrl+jingdianxinxilist[0].jingdiantupian.split(',')[0]:''"></image>
					<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">门票价格:{{jingdianxinxilist[0].menpiaojiage}}</view>
				</view>
				<view class="list-item" :style='{"width":"100%","margin":"0 0 20rpx 0","justifyContent":"space-between","display":"flex","height":"auto"}'>
					<view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
						<view v-if="jingdianxinxilist.length > 1" @tap="onDetailTap('jingdianxinxi',jingdianxinxilist[1].id)" class="box box2" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">{{jingdianxinxilist[1].jingdianmingcheng}}</view>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="jingdianxinxilist[1].jingdiantupian.substring(0,4)=='http'" :src="jingdianxinxilist[1].jingdiantupian"></image>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="jingdianxinxilist[1].jingdiantupian?baseUrl+jingdianxinxilist[1].jingdiantupian.split(',')[0]:''"></image>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">门票价格:{{jingdianxinxilist[1].menpiaojiage}}</view>
						</view>
						<view v-if="jingdianxinxilist.length > 2" @tap="onDetailTap('jingdianxinxi',jingdianxinxilist[2].id)" class="box box3" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">{{jingdianxinxilist[2].jingdianmingcheng}}</view>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"240rpx"}' class="list-item-image" mode="aspectFill" v-if="jingdianxinxilist[2].jingdiantupian.substring(0,4)=='http'" :src="jingdianxinxilist[2].jingdiantupian"></image>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"240rpx"}' class="list-item-image" mode="aspectFill" v-else :src="jingdianxinxilist[2].jingdiantupian?baseUrl+jingdianxinxilist[2].jingdiantupian.split(',')[0]:''"></image>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">门票价格:{{jingdianxinxilist[2].menpiaojiage}}</view>
						</view>
					</view>
					<view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
						<view v-if="jingdianxinxilist.length > 3" @tap="onDetailTap('jingdianxinxi',jingdianxinxilist[3].id)" class="box box4" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">{{jingdianxinxilist[3].jingdianmingcheng}}</view>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"240rpx"}' class="list-item-image" mode="aspectFill" v-if="jingdianxinxilist[3].jingdiantupian.substring(0,4)=='http'" :src="jingdianxinxilist[3].jingdiantupian"></image>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"240rpx"}' class="list-item-image" mode="aspectFill" v-else :src="jingdianxinxilist[3].jingdiantupian?baseUrl+jingdianxinxilist[3].jingdiantupian.split(',')[0]:''"></image>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">门票价格:{{jingdianxinxilist[3].menpiaojiage}}</view>
						</view>
						<view v-if="jingdianxinxilist.length > 4" @tap="onDetailTap('jingdianxinxi',jingdianxinxilist[4].id)" class="box box5" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">{{jingdianxinxilist[4].jingdianmingcheng}}</view>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="jingdianxinxilist[4].jingdiantupian.substring(0,4)=='http'" :src="jingdianxinxilist[4].jingdiantupian"></image>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="jingdianxinxilist[4].jingdiantupian?baseUrl+jingdianxinxilist[4].jingdiantupian.split(',')[0]:''"></image>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">门票价格:{{jingdianxinxilist[4].menpiaojiage}}</view>
						</view>
					</view>
				</view>
				<view v-if="jingdianxinxilist.length > 5" @tap="onDetailTap('jingdianxinxi',jingdianxinxilist[5].id)" class="box box6" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","display":"none","height":"auto"}'>
					<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx"}' class="title ">{{jingdianxinxilist[5].jingdianmingcheng}}</view>
					<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="jingdianxinxilist[5].jingdiantupian.substring(0,4)=='http'" :src="jingdianxinxilist[5].jingdiantupian"></image>
					<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="jingdianxinxilist[5].jingdiantupian?baseUrl+jingdianxinxilist[5].jingdiantupian.split(',')[0]:''"></image>
					<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx"}' class="title ">门票价格:{{jingdianxinxilist[5].menpiaojiage}}</view>
				</view>
			</view>
			
			  
			
			  
			<view v-if="false && 3 == 3" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","width":"100%","justifyContent":"space-between","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">学会选择，学会放弃；</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box2">耐得住寂寞，经得起诱惑。</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
		<view class="listBox recommend" :style='{"width":"100%","margin":"40rpx 0 40rpx 0","background":"#ffffff","order":"2"}'>
			<view v-if="false && 3 == 1" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","width":"100%","justifyContent":"space-between","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">学会选择，学会放弃；</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box2">耐得住寂寞，经得起诱惑。</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
			<view class="title" :style='{"width":"calc(100% - 48rpx)","padding":"20rpx 80rpx 20rpx 80rpx","margin":"0 24rpx 24rpx 24rpx","textAlign":"center","background":"url(http://clfile.zggen.cn/20231201/929f7c0aed824bb3959e8ba0641392c8.gif) no-repeat center center / 100%","height":"auto"}'>
				<view :style='{"padding":"0","color":"#d84fa9","borderRadius":"0px","textAlign":"center","background":"none","display":"inline-block","width":"auto","fontSize":"36rpx","lineHeight":"40rpx","minWidth":"300rpx","fontWeight":"500"}'>酒店信息推荐</view>
			</view>
			
			<view v-if="false && 3 == 2" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","width":"100%","justifyContent":"space-between","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">学会选择，学会放弃；</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box2">耐得住寂寞，经得起诱惑。</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
			
			
			
			  
			
			<!-- 样式6 -->
			<view class="list-box style6" :style='{"width":"100%","padding":"24rpx 24rpx 24rpx 24rpx","margin":"0 0 0 0","height":"auto"}'>
				<view v-if="jiudianxinxilist.length > 0" @tap="onDetailTap('jiudianxinxi',jiudianxinxilist[0].id)" class="box box1" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
					<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">{{jiudianxinxilist[0].fangjianhao}}</view>
					<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="jiudianxinxilist[0].fangjiantupian.substring(0,4)=='http'" :src="jiudianxinxilist[0].fangjiantupian"></image>
					<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="jiudianxinxilist[0].fangjiantupian?baseUrl+jiudianxinxilist[0].fangjiantupian.split(',')[0]:''"></image>
					<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">酒店名称:{{jiudianxinxilist[0].jiudianmingcheng}}</view>
				</view>
				<view class="list-item" :style='{"width":"100%","margin":"0 0 20rpx 0","justifyContent":"space-between","display":"flex","height":"auto"}'>
					<view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
						<view v-if="jiudianxinxilist.length > 1" @tap="onDetailTap('jiudianxinxi',jiudianxinxilist[1].id)" class="box box2" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">{{jiudianxinxilist[1].fangjianhao}}</view>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="jiudianxinxilist[1].fangjiantupian.substring(0,4)=='http'" :src="jiudianxinxilist[1].fangjiantupian"></image>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="jiudianxinxilist[1].fangjiantupian?baseUrl+jiudianxinxilist[1].fangjiantupian.split(',')[0]:''"></image>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">酒店名称:{{jiudianxinxilist[1].jiudianmingcheng}}</view>
						</view>
						<view v-if="jiudianxinxilist.length > 2" @tap="onDetailTap('jiudianxinxi',jiudianxinxilist[2].id)" class="box box3" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">{{jiudianxinxilist[2].fangjianhao}}</view>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"240rpx"}' class="list-item-image" mode="aspectFill" v-if="jiudianxinxilist[2].fangjiantupian.substring(0,4)=='http'" :src="jiudianxinxilist[2].fangjiantupian"></image>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"240rpx"}' class="list-item-image" mode="aspectFill" v-else :src="jiudianxinxilist[2].fangjiantupian?baseUrl+jiudianxinxilist[2].fangjiantupian.split(',')[0]:''"></image>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">酒店名称:{{jiudianxinxilist[2].jiudianmingcheng}}</view>
						</view>
					</view>
					<view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
						<view v-if="jiudianxinxilist.length > 3" @tap="onDetailTap('jiudianxinxi',jiudianxinxilist[3].id)" class="box box4" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">{{jiudianxinxilist[3].fangjianhao}}</view>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"240rpx"}' class="list-item-image" mode="aspectFill" v-if="jiudianxinxilist[3].fangjiantupian.substring(0,4)=='http'" :src="jiudianxinxilist[3].fangjiantupian"></image>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"240rpx"}' class="list-item-image" mode="aspectFill" v-else :src="jiudianxinxilist[3].fangjiantupian?baseUrl+jiudianxinxilist[3].fangjiantupian.split(',')[0]:''"></image>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">酒店名称:{{jiudianxinxilist[3].jiudianmingcheng}}</view>
						</view>
						<view v-if="jiudianxinxilist.length > 4" @tap="onDetailTap('jiudianxinxi',jiudianxinxilist[4].id)" class="box box5" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">{{jiudianxinxilist[4].fangjianhao}}</view>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="jiudianxinxilist[4].fangjiantupian.substring(0,4)=='http'" :src="jiudianxinxilist[4].fangjiantupian"></image>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="jiudianxinxilist[4].fangjiantupian?baseUrl+jiudianxinxilist[4].fangjiantupian.split(',')[0]:''"></image>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">酒店名称:{{jiudianxinxilist[4].jiudianmingcheng}}</view>
						</view>
					</view>
				</view>
				<view v-if="jiudianxinxilist.length > 5" @tap="onDetailTap('jiudianxinxi',jiudianxinxilist[5].id)" class="box box6" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","display":"none","height":"auto"}'>
					<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx"}' class="title ">{{jiudianxinxilist[5].fangjianhao}}</view>
					<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="jiudianxinxilist[5].fangjiantupian.substring(0,4)=='http'" :src="jiudianxinxilist[5].fangjiantupian"></image>
					<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="jiudianxinxilist[5].fangjiantupian?baseUrl+jiudianxinxilist[5].fangjiantupian.split(',')[0]:''"></image>
					<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx"}' class="title ">酒店名称:{{jiudianxinxilist[5].jiudianmingcheng}}</view>
				</view>
			</view>
			
			  
			
			  
			<view v-if="false && 3 == 3" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","width":"100%","justifyContent":"space-between","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">学会选择，学会放弃；</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box2">耐得住寂寞，经得起诱惑。</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
		<view class="listBox recommend" :style='{"width":"100%","margin":"40rpx 0 40rpx 0","background":"#ffffff","order":"2"}'>
			<view v-if="false && 3 == 1" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","width":"100%","justifyContent":"space-between","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">学会选择，学会放弃；</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box2">耐得住寂寞，经得起诱惑。</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
			<view class="title" :style='{"width":"calc(100% - 48rpx)","padding":"20rpx 80rpx 20rpx 80rpx","margin":"0 24rpx 24rpx 24rpx","textAlign":"center","background":"url(http://clfile.zggen.cn/20231201/929f7c0aed824bb3959e8ba0641392c8.gif) no-repeat center center / 100%","height":"auto"}'>
				<view :style='{"padding":"0","color":"#d84fa9","borderRadius":"0px","textAlign":"center","background":"none","display":"inline-block","width":"auto","fontSize":"36rpx","lineHeight":"40rpx","minWidth":"300rpx","fontWeight":"500"}'>地方美食推荐</view>
			</view>
			
			<view v-if="false && 3 == 2" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","width":"100%","justifyContent":"space-between","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">学会选择，学会放弃；</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box2">耐得住寂寞，经得起诱惑。</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
			
			
			
			  
			
			<!-- 样式6 -->
			<view class="list-box style6" :style='{"width":"100%","padding":"24rpx 24rpx 24rpx 24rpx","margin":"0 0 0 0","height":"auto"}'>
				<view v-if="difangmeishilist.length > 0" @tap="onDetailTap('difangmeishi',difangmeishilist[0].id)" class="box box1" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
					<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">地方名称:{{difangmeishilist[0].difangmingcheng}}</view>
					<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">美食名称:{{difangmeishilist[0].meishimingcheng}}</view>
					<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="difangmeishilist[0].meishitupian.substring(0,4)=='http'" :src="difangmeishilist[0].meishitupian"></image>
					<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="difangmeishilist[0].meishitupian?baseUrl+difangmeishilist[0].meishitupian.split(',')[0]:''"></image>
				</view>
				<view class="list-item" :style='{"width":"100%","margin":"0 0 20rpx 0","justifyContent":"space-between","display":"flex","height":"auto"}'>
					<view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
						<view v-if="difangmeishilist.length > 1" @tap="onDetailTap('difangmeishi',difangmeishilist[1].id)" class="box box2" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">地方名称:{{difangmeishilist[1].difangmingcheng}}</view>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">美食名称:{{difangmeishilist[1].meishimingcheng}}</view>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="difangmeishilist[1].meishitupian.substring(0,4)=='http'" :src="difangmeishilist[1].meishitupian"></image>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="difangmeishilist[1].meishitupian?baseUrl+difangmeishilist[1].meishitupian.split(',')[0]:''"></image>
						</view>
						<view v-if="difangmeishilist.length > 2" @tap="onDetailTap('difangmeishi',difangmeishilist[2].id)" class="box box3" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">地方名称:{{difangmeishilist[2].difangmingcheng}}</view>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">美食名称:{{difangmeishilist[2].meishimingcheng}}</view>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"240rpx"}' class="list-item-image" mode="aspectFill" v-if="difangmeishilist[2].meishitupian.substring(0,4)=='http'" :src="difangmeishilist[2].meishitupian"></image>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"240rpx"}' class="list-item-image" mode="aspectFill" v-else :src="difangmeishilist[2].meishitupian?baseUrl+difangmeishilist[2].meishitupian.split(',')[0]:''"></image>
						</view>
					</view>
					<view class="list-item-body" :style='{"width":"48%","padding":"0 0 0 0","margin":"0 0 0 0","height":"auto"}'>
						<view v-if="difangmeishilist.length > 3" @tap="onDetailTap('difangmeishi',difangmeishilist[3].id)" class="box box4" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 20rpx 0","position":"relative","height":"auto"}'>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">地方名称:{{difangmeishilist[3].difangmingcheng}}</view>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">美食名称:{{difangmeishilist[3].meishimingcheng}}</view>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"240rpx"}' class="list-item-image" mode="aspectFill" v-if="difangmeishilist[3].meishitupian.substring(0,4)=='http'" :src="difangmeishilist[3].meishitupian"></image>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"240rpx"}' class="list-item-image" mode="aspectFill" v-else :src="difangmeishilist[3].meishitupian?baseUrl+difangmeishilist[3].meishitupian.split(',')[0]:''"></image>
						</view>
						<view v-if="difangmeishilist.length > 4" @tap="onDetailTap('difangmeishi',difangmeishilist[4].id)" class="box box5" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","height":"auto"}'>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">地方名称:{{difangmeishilist[4].difangmingcheng}}</view>
							<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx","textOverflow":"ellipsis"}' class="title ">美食名称:{{difangmeishilist[4].meishimingcheng}}</view>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="difangmeishilist[4].meishitupian.substring(0,4)=='http'" :src="difangmeishilist[4].meishitupian"></image>
							<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="difangmeishilist[4].meishitupian?baseUrl+difangmeishilist[4].meishitupian.split(',')[0]:''"></image>
						</view>
					</view>
				</view>
				<view v-if="difangmeishilist.length > 5" @tap="onDetailTap('difangmeishi',difangmeishilist[5].id)" class="box box6" :style='{"width":"100%","padding":"0 0 0 0","margin":"0 0 0 0","position":"relative","display":"none","height":"auto"}'>
					<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx"}' class="title ">地方名称:{{difangmeishilist[5].difangmingcheng}}</view>
					<view v-if="true" :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","color":"#333","textAlign":"center","width":"100%","lineHeight":"64rpx","fontSize":"28rpx"}' class="title ">美食名称:{{difangmeishilist[5].meishimingcheng}}</view>
					<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-if="difangmeishilist[5].meishitupian.substring(0,4)=='http'" :src="difangmeishilist[5].meishitupian"></image>
					<image :style='{"width":"100%","objectFit":"cover","display":"block","height":"328rpx"}' class="list-item-image" mode="aspectFill" v-else :src="difangmeishilist[5].meishitupian?baseUrl+difangmeishilist[5].meishitupian.split(',')[0]:''"></image>
				</view>
			</view>
			
			  
			
			  
			<view v-if="false && 3 == 3" class="idea recommendIdea" :style='{"padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","width":"100%","justifyContent":"space-between","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">学会选择，学会放弃；</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box2">耐得住寂寞，经得起诱惑。</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
		<!-- 商品推荐 -->
		
		

		<!-- 商品列表 -->
																																										<view class="listBox list" :style='{"width":"100%","margin":"40rpx 0 40rpx 0","background":"#ffffff","order":"10"}'>
			<view v-if="false && 3 == 1" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		  
			<view class="title" :style='{"width":"calc(100% - 48rpx)","padding":"20rpx 80rpx 20rpx 80rpx","margin":"0 24rpx 24rpx 24rpx","textAlign":"center","background":"url(http://clfile.zggen.cn/20231201/929f7c0aed824bb3959e8ba0641392c8.gif) no-repeat center center / 100%","height":"auto"}'>
				<view :style='{"padding":"0","color":"#d84fa9","borderRadius":"0px","background":"none","display":"inline-block","fontSize":"36rpx","lineHeight":"40rpx","minWidth":"300rpx","fontWeight":"500"}'>酒店信息</view>
				<text :style='{"margin":"0px 0 0 0","color":"#999","display":"inline-block","width":"auto","fontSize":"28rpx","lineHeight":"40rpx","float":"right"}' @tap="onPageTap('jiudianxinxi')">查看更多</text>
			</view>
			
			<view v-if="false && 3 == 2" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
		  		  
		  		  
		  		  <!-- 样式3 -->
		  <view v-if="3 == 3" class="list-box style3" :style='{"padding":"24rpx 24rpx 24rpx 24rpx","margin":"0 0 0 0","flexWrap":"wrap","display":"flex","width":"100%","justifyContent":"space-between","height":"auto"}'>
			<view @tap="onDetailTap('jiudianxinxi',product.id)" v-for="(product,index) in homejiudianxinxilist" :key="index" class="list-item" :style='{"boxShadow":"0 0px 0px #00000030","padding":"0 0 24rpx 0","margin":"0 0 24rpx 0","borderColor":"#f0b8dd","flexWrap":"wrap","borderWidth":"0 0 2rpx 0","display":"flex","width":"48%","borderStyle":"dashed","justifyContent":"space-between","height":"auto"}'>
			  			  			  			  			  <image :style='{"width":"38%","margin":"0 0px 0 0","objectFit":"cover","borderRadius":"0px","display":"block","height":"160rpx"}' class="list-item-image" mode="aspectFill" v-if="product.fangjiantupian.substring(0,4)=='http'" :src="product.fangjiantupian"></image>
			  <image :style='{"width":"38%","margin":"0 0px 0 0","objectFit":"cover","borderRadius":"0px","display":"block","height":"160rpx"}' class="list-item-image" mode="aspectFill" v-else :src="product.fangjiantupian?baseUrl+product.fangjiantupian.split(',')[0]:''"></image>
			  			  			  			  			  			  			  			  			  			  			  			  			  			  			  			  			  			  			  <view class="list-item-body" :style='{"width":"calc(58% - 0px)","padding":"0 0 0 0","margin":"0px 0 0 0","height":"auto"}'>
				                				<view :style='{"padding":"0 4rpx 0 4rpx","margin":"0 0 4rpx 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333333","borderRadius":"0px","background":"#ffffff","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"48rpx"}' class="list-item-title">{{product.fangjianhao}}</view>
								                				                				                				<view :style='{"padding":"0 4rpx 0 4rpx","margin":"0 0 4rpx 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333333","borderRadius":"0px","background":"#ffffff","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"48rpx"}' class="list-item-title">酒店名称:{{product.jiudianmingcheng}}</view>
								                				                				                				                				                				                																																																																																											  </view>
			</view>
		  </view>
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
		  		  
			<view v-if="false && 3 == 3" class="idea listIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / cover","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box1">不后悔过往，不浪费现在</view>
				<view :style='{"width":"100%","textAlign":"center","background":"none","display":"block","height":"48rpx"}' class="box box2">满怀梦想，面对未来</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
																										<!-- 商品列表 -->
		
		
		<!-- 新闻资讯 -->
														<view class="listBox news" :style='{"width":"100%","margin":"40rpx 0 40rpx 0","background":"#ffffff","order":"8"}'>
			<view v-if="false && 3 == 1" class="idea newsIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / 100% 100%","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">走的够远，才懂得前方依旧长路漫漫</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
			<view class="title" :style='{"width":"calc(100% - 48rpx)","padding":"20rpx 80rpx ","margin":"0 24rpx 24rpx 24rpx","textAlign":"center","background":"url(http://clfile.zggen.cn/20231201/929f7c0aed824bb3959e8ba0641392c8.gif) no-repeat center center / 100%","height":"auto"}'>
				<view :style='{"padding":"0","color":"#d84fa9","borderRadius":"0px","background":"none","display":"inline-block","fontSize":"36rpx","lineHeight":"40rpx","minWidth":"300rpx","fontWeight":"500"}'>美食资讯</view>
				<text :style='{"margin":"0px 0 0 0","color":"#999","display":"inline-block","width":"auto","fontSize":"28rpx","lineHeight":"40rpx","float":"right"}' @tap="onPageTap('news')">查看更多</text>
			</view>
			
			<view v-if="false && 3 == 2" class="idea newsIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / 100% 100%","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">走的够远，才懂得前方依旧长路漫漫</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
			
					  
						
						
		  <!-- 样式4 -->
		  		  <view class="news-box1" :style='{"width":"100%","padding":"24rpx 24rpx 24rpx 24rpx","margin":"40rpx 0 0 0","height":"auto"}'>
			<view @tap="onNewsDetailTap(item.id)" v-for="(item,index) in news" :key="index" class="list-item" :style='{"padding":"0 0 24rpx 0","margin":"0 0 24rpx 0","borderColor":"#f0b8dd","flexWrap":"wrap","borderWidth":"0 0 2rpx 0","display":"flex","width":"100%","borderStyle":"dotted","height":"auto"}'>
			  <view class="list-item-body" :style='{"width":"calc(100% - 260rpx)","padding":"0 0 0 0","margin":"0 0 0 0","order":"2","height":"200rpx"}'>
				<view :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","whiteSpace":"nowrap","color":"#333","width":"100%","lineHeight":"60rpx","fontSize":"28rpx","textOverflow":"ellipsis","height":"60rpx"}' class="title ">{{item.title}}</view>
				<view :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","overflow":"hidden","color":"#999","textAlign":"left","width":"100%","lineHeight":"48rpx","fontSize":"28rpx","height":"96rpx"}' class="desc ">{{item.introduction}}</view>
				<view :style='{"padding":"0 20rpx 0 20rpx","margin":"0 0 0 0","color":"#999","textAlign":"right","width":"100%","lineHeight":"48rpx","fontSize":"26rpx"}' class="time">{{item.addtime.split(" ")[0]}}</view>
			  </view>
			  <image :style='{"width":"240rpx","objectFit":"cover","borderRadius":"0px","display":"block","height":"200rpx","order":"1"}' mode="aspectFill" class="listmpic" :src="baseUrl+item.picture"></image>
			</view>
		  </view>
		  		  
		  <!-- 样式5 -->
		  		  
		  <!-- 样式6 -->
		  		  
		  <!-- 样式7 -->
		  		  
		  <!-- 样式8 -->
		  		  
		  <!-- 样式9 -->
		  			
			<view v-if="false && 3 == 3" class="idea newsIdea" :style='{"width":"100%","padding":"40rpx","flexWrap":"wrap","background":"url(http://codegen.caihongy.cn/20230815/1b3e2caf374142fcb4d5bdb9448d4e01.png) no-repeat center bottom / 100% 100%","display":"block","height":"360rpx"}'>
				<view :style='{"width":"100%","margin":"100rpx 0 0 0","textAlign":"center","background":"none","display":"block","height":"auto"}' class="box box1">走的够远，才懂得前方依旧长路漫漫</view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box2"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box3"></view>
				<view :style='{"width":"20%","background":"#ffffff","display":"none","height":"160rpx"}' class="box box4"></view>
			</view>
		</view>
																																																						<!-- 新闻资讯 -->
				

	</view>
</view>
</template>

<script>
    import menu from '@/utils/menu'
	import '@/assets/css/global-restaurant.css'
	import uniIcons from "@/components/uni-ui/lib/uni-icons/uni-icons.vue"
	export default {
		components: {
			uniIcons
		},
		data() {
			return {
				options2: {
					effect: 'flip',
					loop : true
				},
				options3: {
					effect: 'cube',
					loop : true,
					cubeEffect: {
						shadow: true,
						slideShadows: true,
						shadowOffset: 20,
						shadowScale: 0.94,
					}
				},
				rows: 2,
				column: 4,
                role : '',
                menuList: [],
                swiperMenuList:[],
                user: {},
                tableName:'',

				//轮播
				swiperList: [],
				jingdianxinxilist: [],
				jiudianxinxilist: [],
				difangmeishilist: [],
				homejiudianxinxilist: [],
				news: [],
			}
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			}
		},
        async onLoad(){
            this.role = uni.getStorageSync("appRole");
            let table = uni.getStorageSync("nowTable");
            let res = await this.$api.session(table);
            this.user = res.data;
            this.tableName = table;
            let menus = menu.list();
            this.menuList = menus;
            this.menuList.forEach((item,key) => {
                if(this.role==item.roleName) {
                    item.frontMenu.forEach((item2,key2) => {
						if(item2.child.length) {
							item2.childs = []
						    item2.child.forEach((item3,key3)=>{
								if(item3.buttons.indexOf("查看")>-1){
									item2.childs.push(item3)
									this.swiperMenuList.push(item3);
								}
							})
						}
                        
                    })
                }
            })
        },
		async onShow() {
            let res;
			// 轮播图
			let swiperList = []
			res = await this.$api.list('config', {
				page: 1,
				limit: 5
			});
			for (let item of res.data.list) {
				if (item.value && item.value!="" && item.value!=null ) {
					swiperList.push({
						img: item.value,
                        title: item.name
					});
				}
			}
			if (swiperList) {
				this.swiperList = swiperList;
			}
			// 美食资讯
			res = await this.$api.list('news', {
				page: 1,
				limit: 6
			});
			this.news = res.data.list

			// 推荐信息
			res = await this.$api.recommend('jingdianxinxi', {                                              
                page: 1,
                limit: 6
            });
			this.jingdianxinxilist = res.data.list
			// 推荐信息
			res = await this.$api.recommend('jiudianxinxi', {                                              
                page: 1,
                limit: 6
            });
			this.jiudianxinxilist = res.data.list
			// 推荐信息
			res = await this.$api.recommend('difangmeishi', {                                              
                page: 1,
                limit: 6
            });
			this.difangmeishilist = res.data.list

			res = await this.$api.list('jiudianxinxi', {
				page: 1,

				limit: 6
			});
			this.homejiudianxinxilist = res.data.list
		},

		methods: {

			//轮播图跳转
			onSwiperTap(e) {

			},
			// 新闻详情
			onNewsDetailTap(id) {
				this.$utils.jump(`../news-detail/news-detail?id=${id}`)
			},
			// 推荐列表点击详情
			onDetailTap(tableName, id) {
				this.$utils.jump(`../${tableName}/detail?id=${id}`)
			},
			onPageTap(tableName){
				if(tableName=='news'){
					uni.navigateTo({
						url: `../news-list/news-list`,
						fail: function(){
							uni.switchTab({
								url: `../news-list/news-list`
							});
						}
					});
					return false
				}

				uni.navigateTo({
					url: `../${tableName}/list`,
					fail: function(){
						uni.switchTab({
							url: `../${tableName}/list`
						});
					}
				});
				// this.$utils.jump(`../${tableName}/list`)
			},
			menuClick(menu, index) {
				if (menu.childs.length > 0 && menu.childs.length == 1) {
					uni.navigateTo({
						url: `../${menu.childs[0].tableName}/list`,
						fail: function() {
							uni.switchTab({
								url: `../${menu.childs[0].tableName}/list`
							});
						}
					});
				} else if (menu.childs.length > 1) {
					let arr = []
					for(let x in menu.childs){
						arr.push(menu.childs[x].menu.length>6?menu.childs[x].menu.substring(0,6):menu.childs[x].menu)
					}
					uni.showActionSheet({
						itemList: arr,
						success: function (res) {
							uni.navigateTo({
								url: `../${menu.childs[res.tapIndex].tableName}/list`,
								fail: function() {
									uni.switchTab({
										url: `../${menu.childs[res.tapIndex].tableName}/list`
									});
								}
							});
						}
					});
				}
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
