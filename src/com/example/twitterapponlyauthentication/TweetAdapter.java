package com.example.twitterapponlyauthentication;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class TweetAdapter extends BaseAdapter {
	ArrayList<Tweet> tweetList;
	Context context;

	public TweetAdapter(Context context, ArrayList<Tweet> tweetList) {
		this.tweetList = tweetList;
		this.context = context;
	}

	@Override
	public int getCount() {
		return tweetList.size();
	}

	@Override
	public Object getItem(int position) {
		return null;
	}

	@Override
	public long getItemId(int position) {
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null) {
			LayoutInflater inflater = LayoutInflater.from(context);
			convertView = inflater.inflate(R.layout.tweet_list_item, null);
		}

		Tweet tweet = tweetList.get(position);
		TextView txtTweet = (TextView) convertView.findViewById(R.id.txtTweet);
		TextView txtTweetBy = (TextView) convertView.findViewById(R.id.txtTweetBy);

		txtTweet.setText(tweet.getTweet());
		txtTweetBy.setText(tweet.getTweetBy());

		return convertView;
	}
}
