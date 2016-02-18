package techiebear.com.myapplication;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.List;

/**
 * Created by bjornjohansson on 18/02/16.
 */
public class PostAdapter extends ArrayAdapter<Post>
{
    public PostAdapter(Context context, int resource, List<Post> objects)
    {
        super(context, resource, objects);
    }
}
