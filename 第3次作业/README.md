### 架构截图与说明



### 类图截图与说明

#### Versoin 1

![](img/class_diagram_v1.png)

|         类          |                             说明                             |
| :-----------------: | :----------------------------------------------------------: |
|        User         |       表示使用该系统的用户，拥有用户名、密码等基础属性       |
|      SpotOwner      | 表示在系统中出租停车位的用户，抽象了个人出租者和停车场所有者的公共属性和行为 |
|  PersonalSpotOwner  |                     表示个人停车位出租者                     |
|  ParkingAreaOwner   |          表示停车场所有者，往往出租集中的大量停车位          |
|     ParkingSpot     | 表示注册的一个停车位，拥有所有者 ID、注册时间、服务时间等属性 |
|  ParkingSpotStatus  |           表示停车位的当前状态：空闲、使用中、超时           |
| SpotServiceInterval |   表示停车位的一个服务间隔，包括：周几、几点开始、几点结束   |
|     RentRecord      |  表示一次租用记录，拥有司机 ID、车位 ID、预定开始时间等属性  |
|     FineRecord      |     表示一次超时处罚记录，每条处罚记录对应于一条租用记录     |

#### Version 2



### 系统顺序图截图与说明

- searchParkingSpot 顺序图

![ae11673bb3460b19ee0238155f6b096](https://user-images.githubusercontent.com/49605687/142857448-ba12c8cd-63d0-4aa9-b7d0-cf63d56b1d85.png)

- register 顺序图

![ac9ce84be65665b3facc55916a3e10b](https://user-images.githubusercontent.com/49605687/142857487-01735aff-c4d7-48a8-85fb-2131ba0ebed6.png)

- login 顺序图
![login](https://user-images.githubusercontent.com/49606344/143392430-75fedf26-6d71-4fcf-ae31-9dd21ca0879e.jpg)


### 选用 Architectural Pattern 的理由和具体情况



### 选用 Design Pattern 的理由和具体情况

