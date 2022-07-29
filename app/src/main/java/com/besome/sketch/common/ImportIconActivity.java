package com.besome.sketch.common;

import a.a.a.KB;
import a.a.a.MA;
import a.a.a.Tp;
import a.a.a.Up;
import a.a.a.Vp;
import a.a.a.WB;
import a.a.a.iB;
import a.a.a.mB;
import a.a.a.oB;
import a.a.a.uq;
import a.a.a.wq;
import a.a.a.xB;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.besome.sketch.lib.base.BaseAppCompatActivity;
import com.google.android.gms.analytics.HitBuilders;
import com.google.android.material.textfield.TextInputLayout;
import java.io.File;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class ImportIconActivity extends BaseAppCompatActivity implements View.OnClickListener {
    public Toolbar k;
    public RecyclerView l;
    public Button m;
    public Button n;
    public Button q;
    public Button r;
    public Button s;
    public EditText t;
    public ArrayList<String> v;
    public WB w;
    public a o = null;
    public int p = -1;
    public ArrayList<Pair<String, String>> u = new ArrayList<>();

    public final int m() {
        return ((int) (getResources().getDisplayMetrics().widthPixels / getResources().getDisplayMetrics().density)) / 60;
    }

    public final boolean n() {
        return new oB().e(wq.f());
    }

    public final void o() {
        KB.a(this, "icons" + File.separator + "icon_pack.zip", wq.f());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (mB.a()) {
            return;
        }
        switch (view.getId()) {
            case 2131230804:
                if (!this.w.b() || this.o.c < 0) {
                    return;
                }
                Intent intent = new Intent();
                intent.putExtra("iconName", this.t.getText().toString());
                intent.putExtra("iconPath", (String) this.u.get(this.o.c).second);
                setResult(-1, intent);
                finish();
                return;
            case 2131230809:
                g(0);
                return;
            case 2131230810:
                setResult(0);
                finish();
                return;
            case 2131230831:
                g(1);
                return;
            case 2131230863:
                g(2);
                return;
            default:
                return;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ((GridLayoutManager) this.l.getLayoutManager()).d(m());
        this.l.requestLayout();
    }

    @Override // com.besome.sketch.lib.base.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(2131427456);
        this.k = (Toolbar) findViewById(2131231847);
        a(this.k);
        findViewById(2131231370).setVisibility(8);
        d().a(xB.b().a(getApplicationContext(), 2131625265));
        d().e(true);
        d().d(true);
        this.k.setNavigationOnClickListener(new Tp(this));
        this.v = getIntent().getStringArrayListExtra("imageNames");
        this.m = (Button) findViewById(2131230804);
        this.m.setText(xB.b().a(getApplicationContext(), 2131624968));
        this.n = (Button) findViewById(2131230810);
        this.n.setText(xB.b().a(getApplicationContext(), 2131624974));
        this.m.setOnClickListener(this);
        this.n.setOnClickListener(this);
        this.l = (RecyclerView) findViewById(2131231101);
        this.l.setHasFixedSize(true);
        this.l.setLayoutManager(new GridLayoutManager(getBaseContext(), m()));
        this.o = new a();
        this.l.setAdapter(this.o);
        this.q = (Button) findViewById(2131230809);
        this.r = (Button) findViewById(2131230831);
        this.s = (Button) findViewById(2131230863);
        this.q.setText(xB.b().a(getApplicationContext(), 2131625269));
        this.r.setText(xB.b().a(getApplicationContext(), 2131625270));
        this.s.setText(xB.b().a(getApplicationContext(), 2131625271));
        this.q.setOnClickListener(this);
        this.r.setOnClickListener(this);
        this.s.setOnClickListener(this);
        this.t = (EditText) findViewById(2131230990);
        ((TextInputLayout) findViewById(2131231816)).setHint(xB.b().a(getApplicationContext(), 2131625266));
        this.w = new WB(getApplicationContext(), (TextInputLayout) findViewById(2131231816), uq.b, this.v);
        this.t.setPrivateImeOptions("defaultInputmode=english;");
        k();
        new Handler().postDelayed(new Up(this), 300L);
    }

    @Override // com.besome.sketch.lib.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.d.setScreenName(ImportIconActivity.class.getSimpleName().toString());
        this.d.send(new HitBuilders.ScreenViewBuilder().build());
    }

    /* loaded from: classes.dex */
    class a extends RecyclerView.a<a> {
        public int c = -1;

        /* loaded from: classes.dex */
        class a extends RecyclerView.v {
            public RelativeLayout t;
            public TextView u;
            public ImageView v;

            public a(View view) {
                super(view);
                this.t = (RelativeLayout) view.findViewById(2131231092);
                this.u = (TextView) view.findViewById(2131232002);
                this.v = (ImageView) view.findViewById(2131231102);
                this.v.setOnClickListener(new Vp(this, a.this));
            }
        }

        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        /* renamed from: a */
        public void b(a aVar, int i) {
            if (i != this.c) {
                if (ImportIconActivity.this.p == 2) {
                    aVar.t.setBackgroundColor(-4342339);
                } else {
                    aVar.t.setBackgroundColor(-1);
                }
            } else {
                aVar.t.setBackgroundColor(-13124);
            }
            aVar.u.setText((CharSequence) ((Pair) ImportIconActivity.this.u.get(i)).first);
            try {
                aVar.v.setImageBitmap(iB.a((String) ((Pair) ImportIconActivity.this.u.get(i)).second, 1));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public a b(ViewGroup viewGroup, int i) {
            return new a(LayoutInflater.from(viewGroup.getContext()).inflate(2131427457, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a
        public int a() {
            return ImportIconActivity.this.u.size();
        }
    }

    /* loaded from: classes.dex */
    class c extends MA {
        public c(Context context) {
            super(context);
            ImportIconActivity.this.a(this);
        }

        @Override // a.a.a.MA
        public void a() {
            ImportIconActivity.this.h();
            ImportIconActivity.this.g(0);
        }

        @Override // a.a.a.MA
        public void b() {
            publishProgress("Now processing..");
            if (!ImportIconActivity.this.n()) {
                ImportIconActivity.this.o();
            }
        }

        @Override // a.a.a.MA
        public void a(String str) {
            ImportIconActivity.this.h();
        }
    }

    public final void f(int i) {
        this.t.setText((CharSequence) this.u.get(i).first);
    }

    public final void g(int i) {
        if (this.p == i) {
            return;
        }
        this.p = i;
        int i2 = this.p;
        if (i2 == 0) {
            this.q.setBackgroundColor(-13387531);
            this.r.setBackgroundColor(-1710619);
            this.s.setBackgroundColor(-1710619);
        } else if (i2 == 1) {
            this.q.setBackgroundColor(-1710619);
            this.r.setBackgroundColor(-13387531);
            this.s.setBackgroundColor(-1710619);
        } else if (i2 == 2) {
            this.q.setBackgroundColor(-1710619);
            this.r.setBackgroundColor(-1710619);
            this.s.setBackgroundColor(-13387531);
        }
        new b(getApplicationContext()).execute(new Void[0]);
    }

    public final void l() {
        String[] list;
        this.u = new ArrayList<>();
        int i = this.p;
        String str = "black";
        if (i != 0) {
            if (i == 1) {
                str = "grey";
            } else if (i == 2) {
                str = "white";
            }
        }
        String str2 = "icon_" + str;
        for (String str3 : new File(wq.f() + File.separator + str2).list()) {
            StringBuilder sb = new StringBuilder();
            sb.append(str3.substring(0, str3.indexOf("_" + str)));
            sb.append("_");
            sb.append(str);
            this.u.add(new Pair<>(sb.toString(), wq.f() + File.separator + str2 + File.separator + str3));
        }
    }

    /* loaded from: classes.dex */
    class b extends MA {
        public b(Context context) {
            super(context);
            ImportIconActivity.this.a(this);
            ImportIconActivity.this.k();
        }

        @Override // a.a.a.MA
        public void a() {
            ImportIconActivity.this.h();
            ImportIconActivity.this.t.setText("");
            ImportIconActivity.this.o.c = -1;
            ImportIconActivity.this.o.c();
        }

        @Override // a.a.a.MA
        public void b() {
            publishProgress("Now processing..");
            ImportIconActivity.this.l();
        }

        @Override // a.a.a.MA
        public void a(String str) {
            ImportIconActivity.this.h();
        }
    }
}
