package ua.com.webtuning.accounting;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> mAccountingAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Create some temp data for ListView
        String [] data= {
                "Expense 1 - 100 grn",
                "Expense 2 - 200 grn",
                "Expense 3 - 300 grn",
                "Expense 4 - 400 grn",
                "Expense 5 - 500 grn",
                "Expense 6 - 600 grn",
                "Expense 7 - 700 grn",
                "Expense 8 - 800 grn",
                "Expense 9 - 900 grn",
                "Expense 10 - 110 grn",
                "Expense 11 - 120 grn",
                "Expense 12 - 130 grn",
        };

        List<String> listExpenses = new ArrayList<String>(Arrays.asList(data));
        mAccountingAdapter = new ArrayAdapter<String>(
                getActivity(), //this activity
                R.layout.list_item_expense, //Name of the layout
                R.id.list_item_expense_textview,  // The ID of the textview
                listExpenses); //data

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.listview_expense);
        listView.setAdapter(mAccountingAdapter);

        return rootView;
    }
}
