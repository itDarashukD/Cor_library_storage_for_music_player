package com.example.music_player.storage;

import com.example.music_player.entity.Source;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public interface IStorageSourceService {

    List<Source> save(InputStream inputStream, String filename, String contentType);

    void delete(Source source);

    boolean isExist(Source source);

    InputStream findSongBySource(Source source) throws IOException;

    String getTypeStorage();
}
