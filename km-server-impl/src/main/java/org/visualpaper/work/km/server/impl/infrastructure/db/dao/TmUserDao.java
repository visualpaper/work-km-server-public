package org.visualpaper.work.km.server.impl.infrastructure.db.dao;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.visualpaper.work.km.server.impl.infrastructure.db.dto.TmUserDto;

/**
 * TM_USER テーブル DAO.
 */
@Mapper
public interface TmUserDao {

  @Nonnull
  List<TmUserDto> findAll();

  @Nullable
  TmUserDto find(int id);

  int insert(@Nonnull TmUserDto dto);

  int update(@Nonnull TmUserDto dto);

  int delete(int id);
}
