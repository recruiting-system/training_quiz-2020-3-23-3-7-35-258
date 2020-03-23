**需求描述**  
- 某数据平台，存储用户的信息
- 每个用户有id，参考编号，姓名，类型，地址，电话，邮箱  

要求：
1. 建立对应的数据库，
    
      人物表(person)
      
     |  id  | referenceNumber | name | type  | addressId  |telephone |email |
     | :---: | :---: | :---: | :---: | :---: | :---: | :---: |
     |  1   | 0011           |张三   |  payer|  0021  |2510031   |1@email.com|
     |  2   | 0012           |李四   |  buyer|  0022  |2510748  |2@email.com|
     |  3   | 0013           |王五   |  buyer|  0023  |2510025  |3@email.com|
     |  4   | 0014           |赵六   |  buyer|  0024  |2510923  |4@email.com|
     |  5   | 0015           |王晨   |  buyer|  0025  |2510189  |5@email.com|
     
     地址表(address):

   |  id  | country | city |   street    |
      | :---: | :-----: | :-----: | :--------------: |
      |  0021   | China   |  Beijing  |  Changan  |
      |  0022   | China   |  Wuhan  |  Guanshan  |
      |  0023   | China   |  Shanghai  |  Nanjing  |
      |  0024   | China   |  Nanjing  |  Fuzimiao  |
      |  0025   | China   |  Wuhan  |  Luoyu  |

注：人物表的id为其主键，并自动生成；人物表中的addressId与地址表中的id为外键约束
2. 可以一次性查到所有的人物数据
3. 可以通过单个id和姓名查找数据（可以单个过滤条件查找，也可以联合查找）
4. 可以通过参考编号对查找出来的数据进行排序  
注：上述要求均可以在Application中打印出来

延伸：
1. 可以通过多个类型（type）查找数据
2. 可以通过电话号码对查找出来的数据排序