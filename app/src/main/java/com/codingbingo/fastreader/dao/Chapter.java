package com.codingbingo.fastreader.dao;

import org.greenrobot.greendao.annotation.*;

import com.codingbingo.fastreader.dao.DaoSession;
import org.greenrobot.greendao.DaoException;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT. Enable "keep" sections if you want to edit.

/**
 * Entity mapped to table "CHAPTER".
 */
@Entity(active = true)
public class Chapter {

    @Id(autoincrement = true)
    private Long id;
    private String title;
    private int position;
    private Integer pageCount;
    private Boolean isRead;
    private long bookId;

    /** Used to resolve relations */
    @Generated
    private transient DaoSession daoSession;

    /** Used for active entity operations. */
    @Generated
    private transient ChapterDao myDao;

    @ToOne(joinProperty = "bookId")
    private Book book;

    @Generated
    private transient Long book__resolvedKey;

    @Generated
    public Chapter() {
    }

    public Chapter(Long id) {
        this.id = id;
    }

    @Generated
    public Chapter(Long id, String title, int position, Integer pageCount, Boolean isRead, long bookId) {
        this.id = id;
        this.title = title;
        this.position = position;
        this.pageCount = pageCount;
        this.isRead = isRead;
        this.bookId = bookId;
    }

    /** called by internal mechanisms, do not call yourself. */
    @Generated
    public void __setDaoSession(DaoSession daoSession) {
        this.daoSession = daoSession;
        myDao = daoSession != null ? daoSession.getChapterDao() : null;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Boolean getIsRead() {
        return isRead;
    }

    public void setIsRead(Boolean isRead) {
        this.isRead = isRead;
    }

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    /** To-one relationship, resolved on first access. */
    @Generated
    public Book getBook() {
        long __key = this.bookId;
        if (book__resolvedKey == null || !book__resolvedKey.equals(__key)) {
            __throwIfDetached();
            BookDao targetDao = daoSession.getBookDao();
            Book bookNew = targetDao.load(__key);
            synchronized (this) {
                book = bookNew;
            	book__resolvedKey = __key;
            }
        }
        return book;
    }

    @Generated
    public void setBook(Book book) {
        if (book == null) {
            throw new DaoException("To-one property 'bookId' has not-null constraint; cannot set to-one to null");
        }
        synchronized (this) {
            this.book = book;
            bookId = book.getId();
            book__resolvedKey = bookId;
        }
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#delete(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void delete() {
        __throwIfDetached();
        myDao.delete(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#update(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void update() {
        __throwIfDetached();
        myDao.update(this);
    }

    /**
    * Convenient call for {@link org.greenrobot.greendao.AbstractDao#refresh(Object)}.
    * Entity must attached to an entity context.
    */
    @Generated
    public void refresh() {
        __throwIfDetached();
        myDao.refresh(this);
    }

    @Generated
    private void __throwIfDetached() {
        if (myDao == null) {
            throw new DaoException("Entity is detached from DAO context");
        }
    }

}
