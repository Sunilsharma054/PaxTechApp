package in.paxtechnology.paxapp.Adapter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import in.paxtechnology.paxapp.Activity.SendsActivity;
import in.paxtechnology.paxapp.Contact;
import in.paxtechnology.paxapp.CustomItemClickListener;
import in.paxtechnology.paxapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import de.hdodenhof.circleimageview.CircleImageView;

public class ContactAdapter extends RecyclerView.Adapter<ContactAdapter.ContactViewHolder> {

    Context mContaxt;
    Activity mActivity;
    List<Contact> contactList;


    public ContactAdapter(Context mContaxt,Activity mActivity, List<Contact> contactList) {
        this.mContaxt = mContaxt;
        this.contactList = contactList;
        this.mActivity = mActivity;
    }

    @NonNull
    @Override
    public ContactAdapter.ContactViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContaxt).inflate(R.layout.item_contact, parent, false);
        return new ContactViewHolder(view,mContaxt,mActivity,contactList);
    }

    @Override
    public void onBindViewHolder(@NonNull ContactAdapter.ContactViewHolder holder, int position) {

        Contact contact = contactList.get(position);
        holder.name_contact.setText(contact.getName());
        holder.phone_contact.setText(contact.getPhone());

        if (contact.getPhoto() != null){
            Picasso.get().load(contact.getPhoto()).into(holder.image_contact);
        }else {
            holder.image_contact.setImageResource(R.mipmap.ic_launcher_round);
        }

    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }



    public class ContactViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView name_contact, phone_contact;
        CircleImageView image_contact;
        Context mContaxt;
        List<Contact> contactList;
        Activity mActivity;


        public ContactViewHolder(@NonNull View itemView, Context mContaxt,Activity mActivity, List<Contact> contactList) {
            super(itemView);

            this.mContaxt = mContaxt;
            this.contactList = contactList;
            this.mActivity = mActivity;

            name_contact = itemView.findViewById(R.id.name_Contact);
            phone_contact = itemView.findViewById(R.id.phone_contact);
            image_contact = itemView.findViewById(R.id.image_contact);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            Intent returnIntent = new Intent();
            returnIntent.putExtra("name_contact_id", name_contact.getText());
            returnIntent.putExtra("phone_contact_id", phone_contact.getText());
            mActivity.setResult(1,returnIntent);
            mActivity.finish();

        }
    }
}
