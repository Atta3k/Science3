<script setup>

</script>

<template>
<div>
  <el-form ref="form" :model="mail" label-width="80px">
    <el-form-item label="姓名">
      <el-input v-model="mail.name"></el-input>
    </el-form-item>
    <el-form-item label="电话">
      <el-input v-model="mail.number"></el-input>
    </el-form-item>
    <el-form-item label="地址">
      <el-input v-model="mail.address"></el-input>
    </el-form-item>
  <el-form-item>
    <el-button type="primary" @click="AddInfo">确定</el-button>
    <el-button type="primary" @click="back()">返回</el-button>
  </el-form-item>
  </el-form>
</div>
</template>
<script>
export default{
  data(){
    return{
      mail:{
        name:'',
        number:'',
        address:''
      }
    }
  },
  methods:{
    AddInfo(){
    this.$http({
      method:'post',
      url:'mail/add',
      data:{
        name:this.mail.name,
        number:this.mail.number,
        address:this.mail.address
      }
    }).then(res=>{
      if(res.data.code===200){
        this.$message({
          showClose:true,
          message:"Success!",
          type:'success'
        })
        this.$router.push({path:'/'})
      }
    })
    },
    back(){
        this.$router.push({path:'/'})
    }
  }
}
</script>

<style scoped>

</style>
