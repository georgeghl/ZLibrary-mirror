package go.zlib.mirror.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import go.zlib.mirror.Pojo.Book;

@Mapper
@Repository
public interface BookMapper {
    public List<Book> selectBookByTitle(String title);
}
