package zhengshiban.day009;
import java.util.Scanner;
public class book {
    public static void main(String[] args) {
//        定义Scanner类
        Scanner sc=new Scanner(System.in);
//        设置管理员验证锁，只有输入管理员验证锁才可以注册管理员
        String lock="123456";
//        定义两个布尔类型的值用于判断是管理员登录还是用户登录
//        默认值都为false，因为没有还未登录
        boolean msuccess=false;
        boolean useccess=false;
//        定义x,y用于控制管理员和用户的数组的输出大小
        int x=0;
        int y=0;
//        定义两个变量用于修改信息时确认修改的数组位置
        int t=0;
        int t1=0;
//        定义布尔值a用于返回到主界面
        boolean a=true;
//        定义图书的数组，此处定义数组大小为100，并输入了四本初始的图书，方便后期的增删改查
        String[] book=new String[100];
        book[0]="红楼梦";
        book[1]="西游记";
        book[2]="三国演义";
        book[3]="水浒传";
//        定义变量b，和x,y用法差不多，用于控制输出的书本的数组大小，应为已经录入了四本书，所以b的初始值为4
        int b=4;
//        定义书本的价格数组，用于查看书本信息时与书本数组一起输出，故应与书本数组大小一致，都是100，并录入已经录入的四本书的价格
        double[] price=new double[100];
        price[0]=10.0;
        price[1]=5.0;
        price[2]=20.0;
        price[3]=15.0;
//        定义书本的状态数组，用于查看书本信息时能查看书本的借阅状态，故大小也与书本数组大小一致，为100，并将已经录入的前四本都为未借阅状态
        String[] state=new String[100];
        state[0]="未借阅";
        state[1]="未借阅";
        state[2]="未借阅";
        state[3]="未借阅";
//        定义数组mes，用于存储用户当前借了哪本书，管理员查看所有用户信息时一起展示，因为新用户啥也没借，故初始为默认null
        String[] mes=new String[10000];
//        定义了管理员数组用于存储所有管理员信息，因为管理员相对较少，所以定义该数组大小为10
        String[] manager =new String[10];
//        将电话号码、身份证号、密码存放入新的数组中，便于后期登录验证，大小与管理员数组一致
        String[] mnum=new String[10];
        String[] mcard=new String[10];
        String[] mpass=new String[10];
//        定义用户数组，用于存储所有用户的信息，因为用户数量较多，所以定义了大小为10000的数组
        String[] user =new String[10000];
//       将电话号码、身份证号、密码存放入新的数组中，便于后期登录验证，大小与用户数组一致
        String[] unum=new String[10000];
        String[] ucard=new String[10000];
        String[] upass=new String[10000];
//        使用do···while 循环来返回到主界面，while判断条件为布尔类型的a，因为a初始值为true，所以不退出系统则默认返回到主界面
        do {
//            显示主界面的选项
            System.out.println("********欢迎光临********");
            System.out.println("登录");
            System.out.println("注册");
            System.out.println("退出系统");
            System.out.println("你选择：");
//            定义字符串choose，让用户输入选择的选项
            String choose = sc.next();
//            使用switch循环根据用户选择的主界面的选项运行相关的程序
            switch (choose) {
//                当用户输入注册时进入当前程序
                case "注册":
//                    判断用户需要注册管理员还是用户，并提醒管理员仅可以注册十人
                    System.out.println("请选择注册管理员还是用户（输入管理员|用户）");
                    System.out.println("注意！管理员仅可注册十人！");
//                    定义字符串sin1来记录用户输入的信息
                    String sin1 = sc.next();
//                    使用switch循环根据用户的选择运行对应的程序
                    switch (sin1) {
//                        当用户输入管理员时，sin1为管理员，则运行当前程序
                        case "管理员":
//                            注册管理员需要输入管理员密码，定义字符串key用于存储用户输入的数据，方便后面进行对比
                            System.out.println("请输入管理员密码：");
                            String key = sc.next();
//                            判断用户输入的密码与管理员验证锁是否一致，一致才可以运行注册管理员的程序，否则输出"你没有管理员密码，无权添加管理员"
                            if (key.equals(lock)) {
//                                按顺序输入姓名，电话，身份证等信息存储进管理员数组中，每注册的一个管理员就是管理员数组中的一个元素
                                System.out.println("请输入姓名:");
                                String name = sc.next();
                                System.out.println("请输入电话号码：");
                                String num = sc.next();
                                System.out.println("请输入身份证：");
                                String card = sc.next();
                                System.out.println("请输入密码：");
                                String pass = sc.next();
                                System.out.println("请输入性别：");
                                String sex = sc.next();
                                System.out.println("请输入专业：");
                                String obj = sc.next();
                                System.out.println("请输入住址：");
                                String address = sc.next();
//                                通过遍历将注册的管理员信息录入到管理员数组中
                                for (int i = x; i < x + 1; i++) {
                                    manager[i] = ((i + 1) + name+"\t"+num+ "\t" + card + "\t" + pass + "\t" + sex + "\t" + obj + "\t" + address);
//                                    将电话，身份证，密码分别存入准备好的数组中，方便后面登录判断
                                    mnum[i] = (num);
                                    mcard[i] = (card);
                                    mpass[i] = (pass);
                                }
//                                之前说过使用变量x来控制输出的管理员信息，没注册一名管理员，x就加一用于输出时控制数组输出所有的管理员信息，不多不少
                                x++;
                            } else {
//                                此时表示用户输入的数据key与管理员验证锁不一致，则无权注册，打印"你没有管理员密码，无权添加管理员"提示当前用户并返回到注册界面
                                System.out.println("你没有管理员密码，无权添加管理员");
                            }
                            break;
//                            当用户选择注册用户时则进入当前程序，因为是注册用户，所以不需要核对管理员验证锁，直接注册
                        case "用户":
//                            运行方式和注册管理员的程序一样，只是录入到用户的相关数组中，就不做过多解释
                            System.out.println("请输入姓名:");
                            String name = sc.next();
                            System.out.println("请输入电话号码：");
                            String num = sc.next();
                            System.out.println("请输入身份证：");
                            String card = sc.next();
                            System.out.println("请输入密码：");
                            String pass = sc.next();
                            System.out.println("请输入性别：");
                            String sex = sc.next();
                            System.out.println("请输入专业：");
                            String obj = sc.next();
                            System.out.println("请输入住址：");
                            String address = sc.next();
                            for (int i = y; i < y + 1; i++) {
                                user[i] = ((i + 1) +"\t"+ name + "\t"+num+"\t" + card + "\t" + pass + "\t" + sex + "\t" + obj + "\t" + address+"\t");
                                unum[i] = (num);
                                ucard[i] = (card);
                                upass[i] = (pass);

                            }
//                            此时因为新注册了一位用户，所以后面输出所有用户时要输出一位用户，所以y加一，使后面输出用户数组时多输出一行
                            y++;
                            break;
//                            default用于防止用户输入的选项没有相关的程序，输出没有该选项然后返回到选择管理员还是用户，让用户重新选择
                        default:
                            System.out.println("没有该选项");
                            break;
                    }
                    break;
//                    当用户选择登录时进入当前程序中
                case "登录":
//                    让用户选择是登录管理员还是用户，将用户输入的值存入字符串sup中用于判断登录管理员还是用户
                    System.out.println("请选择管理员登录|用户登录（输入管理员|用户）");
                    String sup = sc.next();
                    switch (sup) {
//                        当用户输入管理员时进入如下程序
                        case "管理员":
//                            让用户选择身份证登录还是电话登录
                            System.out.println("请选择电话登录还是身份证登录（输入身份证|电话）：");
                            String sign1 = sc.next();
//                            通过if else 判断用户通过身份证还是电话登录
                            if ("身份证".equals(sign1)) {
//                                身份证进入此程序
                                System.out.println("请输入身份证号码");
//                                让用户输入身份证并将输入的数据存入card1中用于比对是否有此管理员
                                String card1 = sc.next();
//                                定义布尔类型的z用于判断是否由当前用户所输入的身份证号，默认为true；
                                boolean z = true;
//                                通过遍历的方式遍历管理员数组查找是否有用户输入的身份证号
                                for (int i = 0; i < manager.length; i++) {
                                    if (mcard[i].equals(card1)) {
//                                        此时通过遍历找到了身份证，让用户输入对应密码，都一致才可以登陆成功
                                        System.out.println("请输入对应的密码：");
                                        String pass1 = sc.next();
//                                        判断输入的密码与数组中对应的密码是否一致，一致即可登陆成功并进入管理员界面
                                        if (pass1.equals(mpass[i])) {
                                            System.out.println("登陆成功");
//                                            此时登陆成功，之前定义的t使其等于当前的i，即确认当前管理员在管理员数组中的位置，方便后面信息的修改
                                            t=i;
//                                            此时用于判定登录的是管理员还是用户
                                            msuccess=true;
                                            useccess=false;
//                                            将布尔值z改为false表示有当前账号且登录成功
                                            z = false;
                                            break;
                                        } else {
//                                            此时有账号但是密码输入错误，提示登录失败
                                            System.out.println("登录失败,账户与密码不匹配");
//                                            管理员数组中有用户输入的账号，所以z为false
                                            z = false;
                                            break;
                                        }
                                    }
                                    if (z) {
//                                        若管理员数组中找不到用户输入的账号，所以z还是为默认值true，则进入此if循环中，输出找不到该账户
                                        System.out.println("找不到该账户");
                                        break;
                                    }
                                }
                            } else if ("电话".equals(sign1)) {
//                                或者用户选择电话登录，则进入当前程序中
                                System.out.println("请输入电话号码");
//                                让用户输入账号的电话号码存入num1中用于比对
                                String num1 = sc.next();
//                                这个z和身份证中的z用法一样，都是用于判断当前数组中是否有用户输入的信息
                                boolean z = true;
//                                用遍历的方式遍历数组查找是否有用户输入的电话号码
                                for (int i = 0; i < manager.length; i++) {
                                    if (mnum[i] == num1) {
//                                        此时用户输入的信息已经通过遍历找到了，让用户输入对应的密码
                                        System.out.println("请输入对应的密码：");
                                        String pass1 = sc.next();
                                        if (pass1 == mpass[i]) {
//                                            如果用户输入的密码与对应的密码一致，则表示登陆成功
                                            System.out.println("登陆成功");
//                                            此处的t与身份证登录中的t一样，都是通过记录当前的信息在数组中的位置方便后期的修改信息操作
                                            t=i;
//                                            此时用于后面判断是管理员登录还是用户登录，判断进入管理员界面还是用户界面和身份证中的一样
                                            msuccess=true;
                                            useccess=false;
//                                            登陆成功表示有用户输入的电话号码，所以z等于false
                                            z = false;
                                            break;
                                        } else {
                                            System.out.println("登录失败,账户与密码不匹配");
//                                            此时密码输入错误但是电话号码确实在数组中，故z也是false
                                            z = false;
                                            break;
                                        }
                                    }
                                    if (z) {
//                                        此时没有在管理员数组中找到用户输入的数据，故不会将z改为false，故z仍为默认值true就会执行输出找不到账号
                                        System.out.println("找不到该账户");
                                        break;
                                    }
                                }
                            } else{
//                                当用户既没选择电话也没选择身份证则进入此程序输出提醒用户输出正确选项
                                System.out.println("请选择正确选项");
                            }
                            break;
                        case "用户":
//                            此为用户登录模块和管理员模块程序运行方式一样
                            System.out.println("请选择电话登录还是身份证登录（输入身份证|电话）：");
//                            让用户输入选择身份证登录还是电话登录
                            String sign = sc.next();
                            if ("身份证".equals(sign)) {
//                                此时用户选择了身份证登录的方式
                                System.out.println("请输入身份证号码");
//                                让用户输入数据存放在card中便于后面比对
                                String card = sc.next();
//                                定义布尔值z用于判断是否有用户输入的身份证，默认为true
                                boolean z = true;
//                                通过数组遍历的方式在数组中比对
                                for (int i = 0; i < user.length; i++) {
                                    if (ucard[i].equals(card)) {
//                                        此时表明数组中有用户输入的身份证号码
                                        System.out.println("请输入对应的密码：");
//                                        让用户输入密码
                                        String pass = sc.next();
                                        if (pass.equals(upass[i])) {
//                                            如果密码与输入的身份证号对应的密码一致，则登陆成功
                                            System.out.println("登陆成功");
//                                            用t1记录当前登录的用户在用户数组中的位置
                                            t1=i;
//                                            此时用于后面判断登录的是管理员还是用户，判断应该进入的是管理员模块还是用户模块
//                                            此时表示应该进入用户模块
                                            useccess=true;
                                            msuccess=false;
//                                            将z赋值为false，表示有该账户
                                            z = false;
                                            break;
                                        } else {
//                                            此时代表有该账户，但是输入的密码与该账户不匹配，登录失败
                                            System.out.println("登录失败,账户与密码不匹配");
//                                            此时虽然登录失败但是用户数组中是有该账户的，所以仍然将z赋值为false
                                            z = false;
                                            break;
                                        }
                                    }
                                    if (z) {
//                                        若找不到输入的账户，则z仍然为默认值true，就会进入次循环，打印"找不到该账户"
                                        System.out.println("找不到该账户");
                                        break;
                                    }
                                }
                            } else if ("电话".equals(sign)) {
//                                此时用户选择了通过电话的方式登录账号则会进入此模块
                                System.out.println("请输入电话号码");
//                                让用户输入数据存入num中方便后面的比对
                                String num = sc.next();
//                                定义z，和身份证登录里的z的用法一样
                                boolean z = true;
//                                通过遍历数组的方式将数组中的元素与用户输入的数据进行一一比对，查找是否有当前账号
                                for (int i = 0; i < user.length; i++) {
                                    if (unum[i] == num) {
//                                        此时表示用户数组中有用户输入的电话
                                        System.out.println("请输入对应的密码：");
//                                        让用户输入数据存入pass中，方便与该电话对应的密码进行比对
                                        String pass = sc.next();
                                        if (pass == upass[i]) {
//                                            此时表示用户输入的密码与输入的电话对应的密码一致，则表示登陆成功
                                            System.out.println("登陆成功");
//                                            记录当前登录的用户在数组中的位置，方便后面相关信息的修改
                                            t1=i;
//                                            此时用于判断是管理员登录还是用户登录，方便后面进行判断是进入管理员模块还是用户模块
//                                            此时表示当前登录的是用户，则后面会进入用户操作界面
                                            useccess=true;
                                            msuccess=false;
//                                            此时表示数组中有该电话号码，所以z为false
                                            z = false;
                                            break;
                                        } else {
//                                            此时表示输入的密码与输入的电话不匹配，则会打印"登录失败,账户与密码不匹配"
                                            System.out.println("登录失败,账户与密码不匹配");
//                                            此时虽然登录失败，但是已有的用户信息中是有输入的电话的，所以z仍为false
                                            z = false;
                                            break;
                                        }
                                    }
                                    if (z) {
//                                        此时表示输入的电话在用户数组中找不到，所以z仍为默认值true，打印"找不到该账户"
                                        System.out.println("找不到该账户");
                                    }
                                }
                            }else{
//                                此时表示用户既没选择身份证的方式也没选择电话的方式，则会打印"请选择正确选项"提醒用户并返回到主界面
                                System.out.println("请选择正确选项");
                            }
                            break;
                        default:
//                            到这里表示用户既没选择管理员也没选择用户，则打印出"没有该选项"提醒用户输入正确选项并返回到主界面
                            System.out.println("没有该选项");
                            break;
                    }
                    if(msuccess){
//                        此时表示msuccess为true，useccess为false，表示管理员登录成功，所以进入管理员界面
                        boolean p=true;
//                        定义布尔类型的p和do while循环来实现返回管理员界面的操作
                        do {
//                            当前打印出管理员的界面所有选项
                            System.out.println("欢迎回来");
                            System.out.println("查看所有图书信息");
                            System.out.println("添加图书");
                            System.out.println("修改图书");
                            System.out.println("删除图书");
                            System.out.println("所有普通用户信息");
                            System.out.println("查看信息");
                            System.out.println("修改信息");
                            System.out.println("退出登录");
                            System.out.println("请选择：");
                            String manage = sc.next();
                            switch (manage) {
//                                此时让管理员选择服务，根据管理员的选择使用switch判断进入哪一个程序
                                case "查看所有图书信息":
//                                    此时管理员选择了"查看所有图书信息"，则通过遍历的方式输出所有书本的相关信息
                                    System.out.println("序号" + "图书" + "\t" + "价格"+"\t"+"状态");
//                                    使用b来控制输出的数组大小，保证不会多输出也不会少输出
                                    for (int i = 0; i < b; i++) {
//                                        输出的信息包含书本的书名、价格和借阅状态
                                        System.out.println((i + 1) + "\t" + book[i] + "\t" + price[i]+"\t"+state[i]);
                                    }
                                    break;
                                case "添加图书":
//                                    此时管理员选择了"添加图书"，则运行下面的程序
                                    System.out.println("请输入想要添加的书籍名");
//                                    让管理员输入要添加的书名
                                    String newbook = sc.next();
                                    System.out.println("请输入新书的价格");
//                                    让管理员输入该书的价格
                                    int np=sc.nextInt();
//                                    将新书的书名、价格录入到书名的数组和价格的数组中，因为是刚添加的，所以默认借阅状态"未借阅"
                                    price[b]=np;
                                    book[b] = newbook;
                                    state[b]="未借阅";
//                                    此时多了一本书，所以控制输出的书本大小的变量b需要加一使得数组多输出一行
                                    b++;
                                    break;
                                case "修改图书":
//                                    此时管理员选择了修改图书的操作，首先通过遍历的方式将所有的书本打印出来方便管理员选择
                                    System.out.println("序号" + "图书" + "\t" + "价格");
                                    for (int i = 0; i < b; i++) {
                                        System.out.println((i + 1) + "\t" + book[i] + "\t" + price[i]);
                                    }
                                    System.out.println("请输入需要修改的图书序号");
//                                    让管理员根据上面输出的书本的数组选择需要修改的数组的序号
                                    int c = sc.nextInt();
                                    System.out.println("请选择修改书名或者价格：");
//                                    让管理员选择是修改该书的书名还是价格
                                    String d = sc.next();
                                    switch (d) {
                                        case "书名":
//                                            此时管理员选择了书名
                                            System.out.println("请输入新名称：");
//                                            让管理员输入该书的新的名称存储进定义的变量n中
                                            String n = sc.next();
//                                            之前的管理员选择的图书序号是c，因为序号要比数组的实际位置大1，所以根据位置将对应位置书的名称修改为改过的书名n
                                            book[c - 1] = n;
                                            break;
                                        case "价格":
//                                            此时管理员选择了修改价格
                                            System.out.println("请输入新价格");
//                                            让管理员输入新的价格，存储到newprice中
                                            int newprice = sc.nextInt();
//                                            同理，之前的管理员选择的图书序号是c，因为序号要比数组的实际位置大1，所以根据位置将对应位置书的价格修改为改过的价格newprice
                                            price[c - 1] = newprice;
                                            break;
                                        default:
//                                            此时管理员既没选择书名也没选择价格，所以打印"没有该选项"提醒管理员
                                            System.out.println("没有该选项");
                                    }
                                    break;
                                case "删除图书":
//                                    此时管理员选择了删除图书的选项，则先将所有书本的信息打印出来方便管理员选择
                                    System.out.println("序号" + "图书" + "\t" + "价格"+"\t"+"状态");
                                    for (int i = 0; i < b; i++) {
//                                        需要打印出书本的书名以及价格和借阅状态方便管理员删除
                                        System.out.println((i + 1) + "\t" + book[i] + "\t" + price[i]+"\t"+state[i]);
                                    }
                                    System.out.println("请选择你要删除哪一本图书，输入该图书的序号");
//                                    让管理员根据输出的书本信息选择要删除的书并输入该书的序号
                                    int e = sc.nextInt();
//                                    首先判断一下该书的借阅状态是不是未借阅，如果已经借阅则无法删除并输出"该书已被借阅，无法删除"
                                    if("未借阅".equals(state[e-1])) {
//                                        通过遍历的方式确定该书的位置并修改该书以及该书后面的书的位置，不会对总体的数组造成影响
                                        for (int i = e - 1; i < b; i++) {
//                                            通过数组覆盖的方式删除该书，并将后面的书都往前面进一位覆盖掉删掉的书
                                            book[i] = book[i + 1];
//                                            价格也进行覆盖，确保书本的信息一致
                                            price[i] = price[i + 1];
//                                            借阅状态同理
                                            state[i]=state[i+1];
                                        }
//                                        因为删掉了一本书，所以最后的位置就会多一本，所以将书本的数组最后一位改为默认值
                                        book[b - 1] = null;
                                        price[b - 1] = 0;
                                        state[b-1]=null;
//                                        将b减1使书本数组输出少一行
                                        b--;
                                    }else{
//                                        此时表示该书的状态为已借阅所以打印"该书已被借阅，无法删除"提醒用户并返回到用户界面
                                        System.out.println("该书已被借阅，无法删除");
                                    }
                                    break;
                                case "所有普通用户信息":
//                                    此时管理员选择"所有普通用户信息"，则遍历打印出用户的数组，并用y来控制输出的行数，同时会显示该用户借阅了哪一本书
                                    for (int i = 0; i < y; i++) {
//                                        输出所有用户的信息，即打印出用户数组和借阅的书本的数组
                                        System.out.println(user[i]+"\t"+mes[i]);
                                    }
                                    break;
                                case "查看信息":
//                                    此时管理员选择"查看信息"，则展示出当前登录的管理员的信息，之前定义的t就在此时起到作用，找到数组中的当前的元素，即当前登录的管理员的信息
                                    for (int i = t; i < t + 1; i++) {
                                        System.out.println(manager[i]);
                                    }
                                    break;
                                case "修改信息":
//                                    此时管理员选择了"修改信息"，则让管理员输入新的更改后的信息
                                    System.out.println("请重新输入你的所有更改后的信息：");
//                                    大致与注册时的操作一样
                                    System.out.println("请输入姓名:");
                                    String name = sc.next();
                                    System.out.println("请输入电话号码：");
                                    String num = sc.next();
                                    System.out.println("请输入身份证：");
                                    String card = sc.next();
                                    System.out.println("请输入密码：");
                                    String pass = sc.next();
                                    System.out.println("请输入性别：");
                                    String sex = sc.next();
                                    System.out.println("请输入专业：");
                                    String obj = sc.next();
                                    System.out.println("请输入住址：");
                                    String address = sc.next();
//                                    将新的信息赋值给管理员数组中的下标为t的元素，即当前登录的管理员的信息在数组中的位置
                                    manager[t] = ((t+1)+"\t"+name + "\t" + num + "\t" + card + "\t" + pass + "\t" + sex + "\t" + obj + "\t" + address);
//                                    同时更改电话，身份证，密码的数组，方便下次登录时使用新的密码等信息
                                    mnum[t] = (num);
                                    mcard[t] = (card);
                                    mpass[t] = (pass);
                                    break;
                                case "退出登录":
//                                    此时管理员选择"退出登录"，将p改为false，则退出do while循环直接返回到主界面
                                    p=false;
                                    break;
                                default:
//                                    此时管理员输入的选项管理员界面没有，则打印"没有该选项，请重新输入"提醒管理员
                                    System.out.println("没有该选项，请重新输入");
                                    break;
                            }
                        }while(p);
                    } else if (useccess) {
//                        此时表示是用户登录，不是管理员登录，则进入用户操作界面
//                        定义的布尔类型的值o与管理员模块的p是一个道理用于返回到用户的操作界面
                        boolean o = true;
//                        使用do while实现返回到用户操作界面的操作
                        do {
                            System.out.println("欢迎光临，本系统有以下服务：");
                            System.out.println("查看所有图书");
                            System.out.println("借阅图书");
                            System.out.println("归还图书");
                            System.out.println("查看信息");
                            System.out.println("修改信息");
                            System.out.println("退出登录");
                            System.out.println("请选择：");
//                            让用户根据用户界面选择服务
                            String use = sc.next();
//                            使用switch判断用户的选择
                            switch (use) {
                                case "查看所有图书":
//                                    此时用户选择了"查看所有图书"，则展示所有图书的书名，以及该书对应的价格信息
                                    System.out.println("序号" + "图书" + "\t" + "价格");
                                    for (int i = 0; i < b; i++) {
                                        System.out.println((i + 1) + "\t" + book[i] + "\t" + price[i]);
                                    }
                                    break;
                                case "借阅图书":
//                                    此时用户选择了"借阅图书"，输出所有的书本的信息方便用户选择具体借阅哪一本
                                    System.out.println("序号" + "图书" + "\t" + "价格");
                                    for (int i = 0; i < b; i++) {
                                        System.out.println((i + 1) + "\t" + book[i] + "\t" + price[i]);
                                    }
                                    System.out.println("请选择需要借阅的图书的序号（只能借阅一本书）：");
//                                    让用户选择借阅哪一本书并输入该书对应的序号
                                    int choice = sc.nextInt();
//                                    输出该书对应的价格提醒用户应当支付多少钱用于借阅
                                    System.out.println("你需支付" + price[choice - 1] + "元");
//                                    将用户后面的信息更改为该书的书名，方便管理员查看该用户借阅了哪一本书
                                    mes[t1] = book[choice - 1];
//                                    修改该书的状态为 已借阅，这样管理员就无法删除这本书
                                    state[choice - 1] = "已借阅";
                                    break;
                                case "归还图书":
//                                    此时用户选择了"归还图书"，则将登录用户的后面的借阅信息改为默认值null方便管理员查看
                                    mes[t1] = null;
//                                    打印出所有的图书方便用户选择归还哪一本书
                                    System.out.println("序号" + "图书" + "\t" + "价格");
                                    for (int i = 0; i < b; i++) {
                                        System.out.println((i + 1) + "\t" + book[i] + "\t" + price[i]);
                                    }
                                    System.out.println("请选择你要归还的图书的序号");
//                                    让用户根据上面打印出的所有图书的信息选择要归还哪一本书，输入对应书本的序号存储进t2中
                                    int t2 = sc.nextInt();
                                    state[t2 - 1] = "未借阅";
                                    break;
                                case "查看信息":
//                                    此时用户选择了"查看信息",则展示出当前登录的用户的信息，之前定义的t1就在此时起到作用，找到数组中的当前的元素，即当前登录的用户的信息
                                    for (int i = t1; i < t1 + 1; i++) {
                                        System.out.println(user[i]);
                                    }
                                    break;
                                case "修改信息":
//                                    此时用户选择了"修改信息"，则和管理员的修改信息的功能一样，输入新的信息赋值给用户及其相关数组的对应未知的元素
                                    System.out.println("请重新输入你的所有更改后的信息：");
//                                    大致与注册时的操作一样
                                    System.out.println("请输入姓名:");
                                    String name = sc.next();
                                    System.out.println("请输入电话号码：");
                                    String num = sc.next();
                                    System.out.println("请输入身份证：");
                                    String card = sc.next();
                                    System.out.println("请输入密码：");
                                    String pass = sc.next();
                                    System.out.println("请输入性别：");
                                    String sex = sc.next();
                                    System.out.println("请输入专业：");
                                    String obj = sc.next();
                                    System.out.println("请输入住址：");
                                    String address = sc.next();
                                    user[t1] = ((t1 + 1) + "\t" + name + "\t" + num + "\t" + card + "\t" + pass + "\t" + sex + "\t" + obj + "\t" + address + "\t");
//                                    下面三个数组和管理员一样，方便更改信息后的下次登录
                                    unum[t1] = (num);
                                    ucard[t1] = (card);
                                    upass[t1] = (pass);
                                    break;
                                case "退出登录":
//                                    此时用户选择了"退出登录"，则o为false，直接跳出当前的do while循环，直接返回到主界面中
                                    o=false;
                                    break;
                                default:
//                                    此时用户输入的数据在用户面板找不到该选项，则进入默认，打印"没有该选项，请重新输入"提示用户并返回到用户界面中让用户重新输入选项
                                    System.out.println("没有该选项，请重新输入");
                                    break;
                            }
                        }while(o);
                    }
                    break;
                case "退出系统":
//                    此时用户选择了"退出系统"，则给a赋值为false，跳出当前do while循环，即直接结束当前程序
                    a=false;
                    break;
                default:
//                    此时用户输入的选项主界面没有，则进入默认，打印"没有该选项，请重新输入"提醒用户，并返回到主界面让用户重新输入
                    System.out.println("没有该选项，请重新输入");
                    break;
            }
        }while(a);
//        打印"欢迎下次使用"并结束程序运行
        System.out.println("*********欢迎下次使用********");
//        关闭Scanner通道，运行一结束就关闭，防止程序占用过多电脑资源
        sc.close();
    }
}
