package go.zlib.mirror.Pojo;

public class Book implements java.io.Serializable{
    private String id;
    private String uploadTime;
    private String time1;
    private String format;
    private String size;
    private String title;
    private String author;
    private String publisher;
    private String language;
    private String publishYear;
    private String page;
    private String torrent;
    private String href="VOID";
    

    @Override
    public String toString() {
        return "Book [id=" + id + ", uploadTime=" + uploadTime + ", time1=" + time1 + ", format=" + format + ", size="
                + size + ", title=" + title + ", author=" + author + ", publisher=" + publisher + ", language="
                + language + ", publishYear=" + publishYear + ", page=" + page + ", torrent=" + torrent + ", href="
                + href + "]";
    }
    public String getHref() {
        return href;
    }
    public void setHref(String href) {
        this.href = href;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getUploadTime() {
        return uploadTime;
    }
    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }
    public String getTime1() {
        return time1;
    }
    public void setTime1(String time1) {
        this.time1 = time1;
    }
    public String getFormat() {
        return format;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getPublishYear() {
        return publishYear;
    }
    public void setPublishYear(String publishYear) {
        this.publishYear = publishYear;
    }
    public String getPage() {
        return page;
    }
    public void setPage(String page) {
        this.page = page;
    }
    public String getTorrent() {
        return torrent;
    }
    public void setTorrent(String torrent) {
        this.torrent = torrent;
    }

    
}
