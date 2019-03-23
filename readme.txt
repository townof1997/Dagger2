AppComponent创建放在Application里面，保证创建是单例模式
/**
 * Singleton实际上价值只是一个模板而已
 * dependencies:使用
 * Created by dell on 2019/3/23.
 * Singleton和ApplicationScope生成的源码没区别
 * 0,多个Component之间不能注入同一个类
 * 1,多个Component之间的scope不能相同
 * 2，singleton组件不能依赖自定义的scope，自定义的scope可以依赖singleleton
 * 3，没有scope的component不能以来有scope的component，有scope的component能依赖没有component的
 *
 *
 *
 */

用自定义的scope就没问题