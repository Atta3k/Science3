<script setup>

import change from "./Change.vue";
</script>

<template>
<div>
  <el-table
    :data="tableData"
  border
  style="width: 100%">
    <el-table-column
      prop="name"
      label="姓名"
      width="200">
    </el-table-column>
    <el-table-column
      prop="number"
      label="电话"
      width="200">
    </el-table-column>
    <el-table-column
      prop="address"
      label="地址"
      width="200">
    </el-table-column>
    <el-table-column
      label="操作"
      width="150">
      <template slot-scope="scope">
        <el-button @click="add()" type="text" size="small">添加</el-button>
        <el-button @click="Change(scope.row)" type="text" size="small">修改</el-button>
        <el-button @click="deleteByid(scope.row.id)" type="text" size="small">删除</el-button>
      </template>
    </el-table-column>
  </el-table>
</div>
</template>

<style scoped>

</style>
<script>
export default {
  name:'Home',
  mounted() {
    this.show();
  },
  methods:{
      show(){
      this.$http({
        method:"post",
        url:'mail/show',
      }).then(res=>{
        if(res.data.code===200){
        this.tableData=res.data.data;
        }
      })
      },
    add(){
      this.$router.push({path:"Add"})
    },
    Change(row){
      this.$router.push({path:'Change',query:{row:row}})
    },
    deleteByid(id){
        this.$http({
          method:'post',
          url:'mail/delete',
          params:{
            id:id,
          }
        }).then(res=>{
          if(res.data.code===200){
            this.show()
            this.$message({
              showClose:true,
              message:"Successful Delete!",
              type:'success'
            })
          }
        })
    }
  },
  data(){
  return {
  tableData:[]
  }
  }

}
</script>
