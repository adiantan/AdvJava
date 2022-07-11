package com.cdacapp;

import java.time.LocalDate;
import java.util.List;

import com.cdac.Dao.AlbumSongDao;
import com.cdac.Dao.GenericDao;
import com.cdac.entity.Album;
import com.cdac.entity.Song;

public class AlbumSongExample {

	
	public static void main(String[]args){
	
		AlbumSongDao dao= new AlbumSongDao();
		
		/*List<Song> songs=dao.fetchSongsSungBy("ed shreen");
		for(Song song:songs)
			System.out.println(song.getTitle()+" "+song.getDuration());
		/*GenericDao dao = new GenericDao();
		//adding album
		Album album=new Album();
		album.setName("Hits of 2022");
		album.setReleaseDate(LocalDate.of(2022, 2,20 ));
		album.setCopyRight("Amezon Music");
		dao.save(album);
			
		
		//adding song in album
		
		Album album = (Album)dao.fetchById(Album.class,3);
		
		Song song = new Song();
		song.setTitle("por");
		song.setArtist("ed shreen");
		song.setDuration(4.00);
		song.setAlbum(album);
		dao.save(song);
	*/
		dao.delete(Song.class,8);
	}
}
