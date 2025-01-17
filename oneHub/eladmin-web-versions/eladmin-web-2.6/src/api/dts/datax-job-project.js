import request from '@/utils/request'

// project

export function list(params) {
  return request({
    url: '/system/api/jobProject',
    method: 'get',
    params
  })
}

export function updated(data) {
  return request({
    url: '/system/api/jobProject',
    method: 'put',
    data
  })
}

export function created(data) {
  return request({
    url: '/system/api/jobProject',
    method: 'post',
    data
  })
}

export function deleted(data) {
  return request({
    url: '/system/api/jobProject',
    method: 'delete',
    params: data
  })
}

export function getJobProjectList(params) {
  return request({
    url: '/system/api/jobProject/list',
    method: 'get',
    params
  })
}

