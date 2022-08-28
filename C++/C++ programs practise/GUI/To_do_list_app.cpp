//---------------------------------------------------------------------------

#include <fmx.h>
#pragma hdrstop

#include "To_do_list_app.h"
//---------------------------------------------------------------------------
#pragma package(smart_init)
#pragma resource "*.fmx"
TForm1 *Form1;
//---------------------------------------------------------------------------
__fastcall TForm1::TForm1(TComponent* Owner)
	: TForm(Owner)
{
}
//---------------------------------------------------------------------------
void __fastcall TForm1::AddButtonClick(TObject *Sender)
{
  String taskText=TaskEdit->Text;      // We have made var taskEdit and accessed a control "taskEdit"
//    and access 'text' property of taskEdit (i.e. we have taken text from taskEdit and stored it in
//     var taskText of type string
	TasksListBox->Items->Add(taskText);     // we have accessed 'Items' in 'TasksListBox'  and called a
	// function and passed parameter 'taskEdit' to add tasks
	TaskEdit->Text="";       // and then we made our 'taskEdit' text a empty string after task is added
	 // to 'TaskslistBox'
	 // and then remove event will be performed on TasksListBox

}
//---------------------------------------------------------------------------
void __fastcall TForm1::TasksListBoxItemClick(TCustomListBox * const Sender, TListBoxItem * const Item)

{
 // the item parameter is the exact item of our list that has been clicked
 int index = Item->Index;         // we have accessed index of item and stored it in var 'index'
 TasksListBox->Items->Delete(index);

}
//---------------------------------------------------------------------------
