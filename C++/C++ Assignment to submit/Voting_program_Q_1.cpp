#include<iostream>
using namespace std;
class Election{
	private:
		int votes;
	public:
		void takeVotes(){       // function to take input for votes
			cin>>votes;
		}
		int getVotes(){        // function to display votes
			return votes;
		}
};

int main(){
	Election s1, s2;
	cout<<"Enter votes for first student: ";
	s1.takeVotes();
	cout<<"Enter votes for second student: ";
	s2.takeVotes();
	
	if(s1.getVotes()>s2.getVotes())
	{
		cout<<"Student 1 got "<<s1.getVotes()<<" votes and he is winner"<<endl;
	}
	else if(s1.getVotes()==s2.getVotes())
	{
		cout<<"Election is tied with both students got equal number of votes"<<endl;
	}
	else
	{
		cout<<"Student 2 got "<<s2.getVotes()<<" votes and he is winner"<<endl;
	}

	return 0;
}
