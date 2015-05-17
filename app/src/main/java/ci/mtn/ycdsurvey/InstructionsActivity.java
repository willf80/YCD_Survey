package ci.mtn.ycdsurvey;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;

import org.sufficientlysecure.htmltextview.HtmlTextView;


public class InstructionsActivity extends ActionBarActivity {

    HtmlTextView htmlTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instructions);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        htmlTextView = (HtmlTextView) findViewById(R.id.instructionTextView);
        htmlTextView.setHtmlFromRawResource(this, R.raw.instructions, true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == android.R.id.home) {
            this.finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
