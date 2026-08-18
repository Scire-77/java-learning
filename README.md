# Java Learning

> 记录 Java 基础、Spring Boot 和项目练习。

## 项目简介

本仓库用于系统性记录 Java 学习过程，从零基础的语法入门，逐步推进到面向对象、框架（Spring Boot）以及项目实战。所有练习代码位于 `JAVA CODE/` 目录，学习笔记见 `JAVA NOTE.docx`。

## 学习进度总览

| 时间 | 阶段 | 主要内容 | 对应工程 |
|------|------|----------|----------|
| 2026-07-13 | 仓库初始化 | README、.gitignore | — |
| 2026-07-30 | Java 基础 / 流程控制 | 字面量、变量、运算符、if 分支、switch；for / while / do-while、循环嵌套、控制循环、死循环 | `basic-code` |
| 2026-08-02 | 数组 | 数组定义、遍历、常见练习 | `basic-code` |
| 2026-08-03 | 方法 | 方法定义、重载、返回值 | `basic-code` |
| 2026-08-07 | 算法练习 | 基础算法题练习（6 题） | `basic-code` |
| 2026-08-09 | 面向对象基础 | 类与对象、封装、构造方法、this、标准 JavaBean | `object-oriented-programming_oop` |
| 2026-08-13 | 进阶语法 | static、final、enum 枚举、工具类 | `oopadvanced` |
| 2026-08-15 | 继承 | 继承、方法重写、super、多态 | `oop-extends` |
| 2026-08-18 | 继承练习 / 多态 / 抽象类 | 继承综合作业（餐饮 / 员工 / 菜品 / 电商 / 物流）、带继承的 JavaBean；多态（父类引用指向子类对象）、向上/向下转型、instanceof；抽象方法、抽象类（Animals / Cat / Dog） | `oop-extends、oop-polymorphic` |

## 目录结构

```
Code-learning/
├── README.md                          # 本文件
├── JAVA NOTE.docx                     # 学习笔记
└── JAVA CODE/                         # 练习代码
    ├── HelloWorld/                    # 环境入门
    ├── basic-code/                    # Java 基础语法（最大工程，73 个源文件）
    ├── object-oriented-programming_oop/  # 面向对象基础
    ├── oop-extends/                   # 继承（60 个源文件）
    ├── oop-polymorphic/              # 多态与抽象类（19 个源文件）
    └── oopadvanced/                   # 进阶语法
```

## 各阶段详解

### 1. 基础语法 — `basic-code`（73 个源文件）

| 包名 | 主题 | 内容 |
|------|------|------|
| `variable` | 变量 | 变量定义与使用（5 个 Demo） |
| `literal` | 字面量 | 各类型字面量（1 个 Demo） |
| `operator` | 运算符 | 算术、赋值、比较、逻辑、三元等（6 个 Demo） |
| `ifdemo` | if 分支 | if / else-if / else（7 个 Demo） |
| `switchdemo` | switch 分支 | switch 语句（2 个 Demo） |
| `loopfor` | for 循环 | for 循环（4 个 Demo） |
| `loopwhile` | while 循环 | while 循环（3 个 Demo） |
| `loopdowhile` | do-while 循环 | do-while 循环（1 个 Demo） |
| `looploop` | 循环嵌套 | 循环嵌套及练习（8 个） |
| `controllerloop` | 控制循环 | break / continue（7 个） |
| `infiniteloop` | 死循环 | 无限循环（1 个 Demo） |
| `array` | 数组 | 数组定义、遍历、练习（13 个） |
| `method` | 方法 | 方法定义、重载（9 个） |
| `test` | 算法练习 | 基础算法题（6 题） |

### 2. 面向对象基础 — `object-oriented-programming_oop`（10 个源文件）

| 包名 | 主题 |
|------|------|
| `ooptest1` | 类与对象（类定义、对象创建、成员调用） |
| `ooptest2` | 封装（private + getter/setter） |
| `ooptest3` | 构造方法与 this |
| `ooptest4` | 标准 JavaBean |
| `ooptest5` | 综合练习 |

### 3. 进阶语法 — `oopadvanced`（10 个源文件）

| 包名 | 主题 |
|------|------|
| `staticvariabletest` | static 静态变量 |
| `finaltest` | final 关键字（修饰类、方法、变量） |
| `enumtest` | enum 枚举 |
| `toolclasstest` | 工具类（静态方法封装） |

### 4. 继承与多态 — `oop-extends`（60 个源文件）

| 包名 | 主题 |
|------|------|
| `oopextendstest1` | 继承的父子类关系（Person / Student / Teacher） |
| `oopextendstest2` | 电子设备继承层级（SmartDevice / Phone / Laptop / Android / IOS） |
| `oopextendstest3` | 继承中成员变量的访问规则（就近原则） |
| `oopextendstest4` | 方法重写 @Override（三代手机功能演变） |
| `oopextendstest5` | 继承综合练习（智能设备价格折扣） |
| `oopextendstest6` | 继承中的构造方法（super() 调用父类构造） |
| `oopextendstest7` | this() 调用本类构造方法（JavaBean 默认值） |
| `oopextendstest8` | 带继承结构的标准 JavaBean（学生 / 老师体系） |
| `oopextendsassignment1` | 继承作业 1：餐饮菜品推荐（经理 / 厨师） |
| `oopextendsassignment2` | 继承作业 2：公司员工体系（教研 / 行政） |
| `oopextendsassignment3` | 继承作业 3：餐厅菜品系统（热菜 / 凉菜） |
| `oopextendsassignment4` | 继承作业 4：电商商品体系（服装 / 电子产品） |
| `oopextendsassignment5` | 继承作业 5：物流快递运费计算（同城 / 异地） |

### 5. 多态与抽象类 — `oop-polymorphic`（19 个源文件）

| 包名 | 主题 |
|------|------|
| `test1` | 多态基础（学生管理系统，多角色注册） |
| `test2` | 多态调用规则（成员变量 / 方法、向上向下转型、instanceof） |
| `test3` | 多态综合练习（Person 驾驶任意交通工具） |
| `test4` | 抽象类与抽象方法（Animals / Cat / Dog，抽象方法重写） |

## 学习路线图

- [x] Java 开发环境搭建（HelloWorld）
- [x] 基础语法（字面量 / 变量 / 运算符 / 分支 / 循环）
- [x] 数组与常用操作
- [x] 方法（定义 / 重载）
- [x] 基础算法练习
- [x] 面向对象基础（封装 / 构造 / this / JavaBean）
- [x] 进阶语法（static / final / enum / 工具类）
- [x] 继承（方法重写 / super / 多态）
- [x] 多态（父类引用 / 转型 / instanceof）
- [x] 抽象类与抽象方法（abstract）
- [ ] 接口（interface）
- [ ] 内部类与常用 API
- [ ] 集合框架（List / Set / Map）
- [ ] 异常处理
- [ ] IO 流
- [ ] 多线程
- [ ] Spring Boot 入门
- [ ] 项目实战

## 环境说明

- 语言：Java
- 开发工具：IntelliJ IDEA
- 工程结构：每个主题为一个独立 IDEA 工程，采用标准 `src/` + 包名组织方式
