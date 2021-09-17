package book;

/**
 * Created by lulu
 * Description:
 * User: Administrator
 * Date: 2021-09-15
 * Time: 20:10
 */
public class BookList {
    private int usedSize;
    private Book[] books = new Book[10];
    public BookList(){
        this.books[0] = new Book("三国演义","罗贯中",19,"小说");
        this.books[1] = new Book("水浒传","施耐庵",32,"小说");
        this.books[2] = new Book("红楼梦","曹雪芹",29,"小说");
        this.usedSize = 3;
    }

    public int getUsedSize() {
        return usedSize;
    }

    public void setUsedSize(int usedSize) {
        this.usedSize = usedSize;
    }

    public Book getPos(int i){
        return books[i];
    }

    public void setBooks(int pos,Book book){
        books[pos] = book;
    }

}
