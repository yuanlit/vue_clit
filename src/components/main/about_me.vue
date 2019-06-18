<template>
    <div>
        <h1>
            除了划水,啥也不会
        </h1>
        <div>数量{{$store.state.num}}</div>
        <div>单价{{$store.state.price}}</div>
        <div>总价{{$store.getters.count}}</div>
        <button @click= 'add'>add</button>
    </div>
</template>

<script>
export default {
  data () {
    return {
      msg: ''
    }
  },
  mounted () {
    console.log(this.$route.params)
  },
  methods: {
    add () {
      // console.log(this.$store)
      // 调用mutations里面的同步方法
      this.$store.commit('add')
    }
  }
}
</script>
