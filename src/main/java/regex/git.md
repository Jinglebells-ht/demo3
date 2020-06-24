[toc]
# 1.git 简介
* 版本控制系统
* GitHub网站上线了，它为开源项目免费提供Git存储

<img src="https://cdn.sspai.com/2019/05/24/1de13eae43785e27bbbcd631931fd161.png" alt="img" style="zoom:50%;" />

##  正则

###  1.匹配ip地址

> 要求：四段 每段范围 0-255 

* 分区间讨论

  * 0-99              [0-9]{1，2}

  * 100 -199      1[0-9]{2}

  * 200 -249      2[0-4] [0-9]

  * 250 -255      25[0-5]

    字符集 的范围 0-9 []不能 位数 {}拓展次

``` java 
(([0-9]{1,2}\.|1[0-9]{2}\.|2[0-4][0-9]\.|25[0-5]\.){3})([0-9]{1,2}|1[0-9]{2}|2[0-4][0-9]|25[0-5])
```

### 2、匹配数字

 ``` java
[0-9]{1,}\.[0-9]{1,}|[0-9]{1,}
 ```

###  
