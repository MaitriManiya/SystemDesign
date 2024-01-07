public class BookIterator implements Iterator{
    private List<Book> books;
    private int index=0;

    public BookIterator(List<Book> books)
    {
        this.books=books;
    }
    @java.lang.Override
    public boolean hasNext() {
        return index<books.size();
    }

    @java.lang.Override
    public java.lang.Object next() {
        if(this.hasNext()){
            return books.get(index++);
        }
        return null;
    }
}
