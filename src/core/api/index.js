import request from './http'
// var pox = '/apis'
var url1 = '/json1811.ashx'
class Apis {
  // joke (data) {
  //   return request({
  //     method: 'get',
  //     url: '/joke',
  //     params: data
  //   })
  // }
  GetBannerList (data) {
    return request({
      method: 'get',
      url: url1,
      params: data
    })
  }
}

export default new Apis()
