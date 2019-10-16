package com.stackroute.musicplayer.repository;

import com.stackroute.musicplayer.domain.Music;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface MusicRepository extends JpaRepository<Music,Integer> {
@Query("FROM Music WHERE songName = ?1")
List<Music> trackByName(@Param("name") String name);



}
