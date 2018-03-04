package com.lixb.digitalcode.act;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.lixb.digitalcode.R;

import java.util.Random;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class DigitalCodeActivity extends AppCompatActivity {

    @BindView(R.id.vp_digitalcode)
    ViewPager mVpDigitalcode;
    @BindView(R.id.btn_hide)
    Button mBtnHide;
    @BindView(R.id.btn_random)
    Button mBtnRandom;
    @BindView(R.id.tv_digit)
    TextView mTvDigit;
    @BindView(R.id.tv_desc)
    TextView mTvDesc;
    private DigitalPageAdapter mDigitalPageAdapter;
    private Random mRandom;
    private boolean isHideText = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_code);
        ButterKnife.bind(this);
        mRandom = new Random();
        initVp();

    }

    private void initVp() {
        mDigitalPageAdapter = new DigitalPageAdapter(
                ResourceConstants.getDigits(),
                ResourceConstants.getDescs(),
                ResourceConstants.imgs
        );
        mVpDigitalcode.setAdapter(mDigitalPageAdapter);

        mVpDigitalcode.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                updateDigitalTextAndDesc(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void updateDigitalTextAndDesc(int position) {
        if (null != mTvDesc) {
            mTvDesc.setText(ResourceConstants.getDescs()[position]);
        }
        if (null != mTvDigit) {
            mTvDigit.setText(ResourceConstants.getDigits()[position]);
        }
    }

    @OnClick({R.id.btn_hide, R.id.btn_random})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_hide:
                if (isHideText) {
                    mTvDigit.setVisibility(View.VISIBLE);
                    mTvDesc.setVisibility(View.VISIBLE);
                    mBtnHide.setText("隐藏文字");
                } else {
                    mTvDesc.setVisibility(View.INVISIBLE);
                    mTvDigit.setVisibility(View.INVISIBLE);
                    mBtnHide.setText("显示文字");
                }
                isHideText = !isHideText;
                break;
            case R.id.btn_random:
                if (null != mDigitalPageAdapter) {
                    int i = mRandom.nextInt(mDigitalPageAdapter.getCount());
                    mVpDigitalcode.setCurrentItem(i);
                }
                break;
        }
    }


    @Override
    protected void onStart() {
        super.onStart();
        if (isHideText) {
            mTvDigit.setVisibility(View.INVISIBLE);
            mTvDesc.setVisibility(View.INVISIBLE);
        } else {
            mTvDesc.setVisibility(View.VISIBLE);
            mTvDigit.setVisibility(View.VISIBLE);
        }
    }

    private class DigitalPageAdapter extends PagerAdapter {

        private int[] imgs;


        public DigitalPageAdapter(String[] digits, String[] descs, int[] imgs) {

            this.imgs = imgs;
        }

        @Override
        public int getCount() {
            return null ==imgs ?0:imgs.length;
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            View view = View.inflate(DigitalCodeActivity.this, R.layout.item_vp_digitalcode, null);
            ImageView iv = view.findViewById(R.id.iv_digit);

            iv.setImageResource(imgs[position]);
            container.addView(view);
            return view;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView((View) object);
        }


    }

}
