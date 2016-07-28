
import constant.Urls;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anartzmugika
 */
public class TestUrls {
    public static void main (String [] args)
    {
        String artist = "su+ta+gar";
        String album = "homo+sapiens";
        String track = "segi+segi";
        String country = "spain";
        System.out.println(String.format("GET SELECT ARTIST INFO ( " + artist + "): " + Urls.GET_INFO_SELECT_ARTIST, artist, 1));
        System.out.println(String.format("GET SELECT ARTIST ALBUM INFO ( " + artist + "): " + Urls.GET_INFO_SELECT_ARTIST_ALBUM, artist, album, 1));
        System.out.println(String.format("GET SELECT ARTIST TRACK INFO ( " + artist + "): " + Urls.GET_INFO_SELECT_TRACK, artist, track, 1));
        System.out.println(String.format("GET SEARCH ARTIST ( " + artist + "): " + Urls.GET_SEARCH_SELECT_ARTIST, artist, 1));
        System.out.println(String.format("GET SEARCH ARTIST ALBUM INFO ( " + artist + "): " + Urls.GET_SEARCH_SELECT_ARTIST_ALBUM, album,1));
        System.out.println(String.format("GET SELECT TRACK INFO ( " + artist + "): " + Urls.GET_SEARCH_SELECT_TRACK, track, 1));
        System.out.println(String.format("GET SIMILAR ARTIST TRACK INFO ( " + artist + "): " + Urls.GET_SIMILAR_ARTIST_TRACK, artist, track, 1));
        System.out.println(String.format("GET SIMILAR SELECT ARTIST ( " + artist + "): " + Urls.GET_SIMILAR_SELECT_ARTIST, artist, 1));
        
        //
        System.out.println(String.format("GET SIMILAR SELECT ARTIST ( " + artist + "): " + Urls.GET_TAGS_SELECT_ARTIST, artist, 1));
        System.out.println(String.format("GET TOP ALBUMS SELECT ARTIST ( " + artist + "): " + Urls.GET_TOP_ALBUMS_SELECT_ARTIST, artist, 1));
        System.out.println(String.format("GET TOP ARTIST BY COUNTRY: " + Urls.GET_TOP_ARTISTS_BY_COUNTRY, country, 1));
        System.out.println(String.format("GET TOP ARTIST CHART ( " + artist + "): " + Urls.GET_TOP_ARTIST_CHART, 1));
        System.out.println(String.format("GET TOP TRACKS BY COUNTRY: " + Urls.GET_TOP_TRACKS_BY_COUNTRY, country, 1));
        System.out.println(String.format("GET TOP TRACKS BY ARTIST ( " + artist + "): " + Urls.GET_TOP_TRACKS_SELECT_ARTIST, artist, 1));
    }
}
