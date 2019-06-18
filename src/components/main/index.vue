<template>
  <div id='app01'>
    <h1>欢迎来到,21cake</h1>
    <div id='box01'>我是主页的盒子</div>
  </div>
</template>

<script>
export default {
  mounted () {
    // var data = {
    //   // 时间戳
    //   v: '1559979113353',
    //   c: 'Index',
    //   // 接口的M值
    //   m: 'GetBannerList',
    //   Type: '2',
    //   City: '苏州'
    // }
    // this.$apis.GetBannerList(data).then(res => {
    //   console.log(res)
    //   this.msg = res.data
    //   console.log(this)
    // })
    this.$eventHub.$on('sub', (val) => {
      console.log(val)
    })
  }
}
</script>

<style scoped lang='scss'>
$color: red;
#box01 {
  background: $color;
  height: r(50 * 2);
}
</style>
