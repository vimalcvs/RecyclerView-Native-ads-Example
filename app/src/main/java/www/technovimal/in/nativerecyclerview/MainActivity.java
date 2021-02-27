package www.technovimal.in.nativerecyclerview;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.rvadapter.AdmobNativeAdAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<Contact> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List <String> list = new ArrayList<>();
        for(int i=0;i<30;i++){
            list.add("Let's save the world "+i);
        }


        RecyclerView rvContacts = findViewById(R.id.rvContacts);
        contacts = Contact.createContactsList(20);
        ContactsAdapter adapter = new ContactsAdapter(contacts);





        //////////
        AdmobNativeAdAdapter admobNativeAdAdapter = AdmobNativeAdAdapter.Builder.with("ca-app-pub-3940256099942544/2247696110", adapter,
                "small").adItemInterval(1).build();
        rvContacts.setAdapter(admobNativeAdAdapter);
        rvContacts.setLayoutManager(new LinearLayoutManager(this));


    }
}
