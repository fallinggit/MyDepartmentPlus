package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @ClassName MyMapper
 * @Description TODO
 * @Author Scorpio
 * @Date 2019/12/9 8:29
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
