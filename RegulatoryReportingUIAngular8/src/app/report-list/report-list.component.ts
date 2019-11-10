import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';

import { ReportService} from '../report.service';
import { Report } from '../report';

@Component({
  selector: 'app-report-list',
  templateUrl: './report-list.component.html',
  styleUrls: ['./report-list.component.css']
})
export class ReportListComponent implements OnInit {

  reports: Observable<Report[]>;

  constructor(private reportService: ReportService) { }

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.reports = this.reportService.getReportList();
  }

}
