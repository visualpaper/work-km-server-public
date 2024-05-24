package org.visualpaper.work.km.server.impl.infrastructure.repository;

import jakarta.annotation.Nonnull;
import jakarta.annotation.Nullable;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.visualpaper.work.km.server.impl.domain.user.User;
import org.visualpaper.work.km.server.impl.domain.user.UserId;
import org.visualpaper.work.km.server.impl.domain.user.UserRepository;
import org.visualpaper.work.km.server.impl.exceptions.KmException;
import org.visualpaper.work.km.server.impl.infrastructure.db.dao.TmUserDao;
import org.visualpaper.work.km.server.impl.infrastructure.db.dto.TmUserDto;

@Repository
public class UserRepositoryImpl implements UserRepository {

  @Autowired
  private TmUserDao dao;

  @Nullable
  @Override
  public User find(@Nonnull UserId id) throws KmException {
    return new User(UserId.from(1), "aaa");
  }

  @Nonnull
  @Override
  public List<User> findAll() throws KmException {
    return List.of();
  }

  @Nonnull
  private User toUser(@Nonnull TmUserDto dto) {
    return new User(UserId.from(dto.getId()), dto.getName());
  }

  @Override
  public void insert(@Nonnull User user) throws KmException {
    TmUserDto dto = new TmUserDto();
    dto.setName(user.name());
  }

  @Override
  public void update(@Nonnull User user) throws KmException {
    TmUserDto dto = new TmUserDto();
    dto.setId(user.id().value());
    dto.setName(user.name());
  }

  @Override
  public void delete(@Nonnull UserId userId) throws KmException {
  }
}
