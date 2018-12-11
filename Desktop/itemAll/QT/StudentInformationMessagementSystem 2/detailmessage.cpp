#include "detailmessage.h"
#include "ui_detailmessage.h"

DetailMessage::DetailMessage(QWidget *parent) :
    QDialog(parent),
    ui(new Ui::DetailMessage)
{
    ui->setupUi(this);
}

DetailMessage::~DetailMessage()
{
    delete ui;
}
