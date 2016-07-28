package constant;

/**
 * @author Anartz Muxika
 * 
 * This file contains Last FM API important urls to get data about, 
 * groups, artists, albums,...
 */

public class Urls {
    public final static String URL_LOCALHOST = "http://ws.audioscrobbler.com/2.0/?method=";
    public static final String SELECT_PAGE = "&page=%d";
    private final static String API_JSON_FORMAT = Values.API_KEY + Values.FORMAT_JSON+ SELECT_PAGE;

    //Artist
    public static String GET_INFO_SELECT_ARTIST = URL_LOCALHOST + "artist.getinfo&artist=%s" + API_JSON_FORMAT;
    public static String GET_TAGS_SELECT_ARTIST = URL_LOCALHOST + "artist.getTags&artist=%s" + API_JSON_FORMAT;
    public static String GET_SIMILAR_SELECT_ARTIST = URL_LOCALHOST + "artist.getsimilar&artist=%s" + API_JSON_FORMAT;
    public static String GET_TOP_ALBUMS_SELECT_ARTIST = URL_LOCALHOST + "artist.gettopalbums&artist=%s" + API_JSON_FORMAT;
    public static String GET_TOP_TRACKS_SELECT_ARTIST = URL_LOCALHOST + "artist.gettoptracks&artist=%s" + API_JSON_FORMAT;
    public static String GET_SEARCH_SELECT_ARTIST = URL_LOCALHOST + "artist.search&artist=%s" + API_JSON_FORMAT;
    
    //Album
    public static String GET_INFO_SELECT_ARTIST_ALBUM = URL_LOCALHOST + "album.getinfo&artist=%s&album=%s" + API_JSON_FORMAT;
    public static String GET_SEARCH_SELECT_ARTIST_ALBUM = URL_LOCALHOST + "album.search&album=%s" + API_JSON_FORMAT;
    
    //Tracks
    
    public static String GET_INFO_SELECT_TRACK = URL_LOCALHOST + "track.getInfo&artist=%s&track=%s" + API_JSON_FORMAT;
    public static String GET_SEARCH_SELECT_TRACK = URL_LOCALHOST + "track.search&track=%s" + API_JSON_FORMAT;
    public static String GET_SIMILAR_ARTIST_TRACK = URL_LOCALHOST + "track.getsimilar&artist=%s&track=%s" + API_JSON_FORMAT;
    
    //Geo
    public static String GET_TOP_ARTISTS_BY_COUNTRY = URL_LOCALHOST + "geo.gettopartists&country=%s" + API_JSON_FORMAT;
    public static String GET_TOP_TRACKS_BY_COUNTRY = URL_LOCALHOST + "geo.gettoptracks&country=%s" + API_JSON_FORMAT;
    
    //Charts
    public static String GET_TOP_ARTIST_CHART = URL_LOCALHOST + "chart.gettopartists" +  API_JSON_FORMAT;
  
}
