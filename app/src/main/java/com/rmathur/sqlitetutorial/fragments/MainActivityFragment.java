package com.rmathur.sqlitetutorial.fragments;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.rmathur.sqlitetutorial.R;
import com.rmathur.sqlitetutorial.data.MySQLiteHelper;
import com.rmathur.sqlitetutorial.models.Book;

import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container, false);

        MySQLiteHelper db = new MySQLiteHelper(getActivity());

        /**
         * CRUD Operations
         * */
        // add Books
        db.addBook(new Book("Book One", "Rohan Mathur"));
        db.addBook(new Book("Book Two", "SIGMobile"));
        db.addBook(new Book("Book Three", "UIUC"));

        // get all books
        List<Book> list = db.getAllBooks();

        // delete one book
        db.deleteBook(list.get(0));

        // get all books
        db.getAllBooks();

        return v;
    }
}
